package citi.devops.dashboard.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import citi.devops.dashboard.model.Todo;

@Service
public class TodoHardcodeService {
	
	private static List<Todo> todos = new ArrayList();
	private static int id=0;
	
	static {
		todos.add(new Todo(++id, "username","description 1", new Date(), false));
		todos.add(new Todo(++id, "username","description 2", new Date(), false));
		todos.add(new Todo(++id, "username","description 3", new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	
	public Todo DeleteById(long id) {
		Todo todo = FindById(id);
		
		if(todo == null)
			return null;
		
		if(todos.remove(todo)) {
			return todo;
		};
		
		return null;
	}

	private Todo FindById(long id) {
		for(Todo todo:todos) {
			if(todo.getId()==(id)) {
				return todo;
			}
			
		}
		return null;
	}

}
