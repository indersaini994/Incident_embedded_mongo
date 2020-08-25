package citi.devops.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import citi.devops.dashboard.Repo.EmpRepo;
import citi.devops.dashboard.model.Emp;

@Service
public class EmpService {
	
	@Autowired
	EmpRepo repo;

	public Emp add(Emp emp) {
		return repo.insert(emp);
	}

	public List<Emp> getAll() {
		return repo.findAll();
	}

	public Emp update(Emp emp) {
		return repo.save(emp);
	}

	public void delete(Emp emp) {
		repo.delete(emp);
	}

}
