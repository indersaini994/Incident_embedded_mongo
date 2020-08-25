package citi.devops.dashboard.controller;

import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import citi.devops.dashboard.model.Todo;
import citi.devops.dashboard.service.TodoHardcodeService;

@CrossOrigin
@RestController
public class TodoController {
	
	@Autowired
	private TodoHardcodeService TodoService;
	
	
	
	@GetMapping("/users/{username}/todo/")
	public List<Todo> getAll(@PathVariable String username){
		return TodoService.findAll();
	}
	
	@DeleteMapping("/users/{username}/todo/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable String username, @PathVariable long id){
		Todo todo = TodoService.DeleteById(id);
		if(todo!= null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}

}
