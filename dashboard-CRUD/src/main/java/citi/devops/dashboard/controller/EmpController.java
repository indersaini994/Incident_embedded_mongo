//package citi.devops.dashboard.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import citi.devops.dashboard.model.Emp;
//import citi.devops.dashboard.service.EmpService;
//
//@RestController
//@RequestMapping("/emp")
//public class EmpController {
//	
//	@Autowired
//	EmpService service;
//	
//	@PostMapping("/")
//	public Emp add(@RequestBody Emp emp) {
//		return service.add(emp);	
//	}
//	
//	@GetMapping("/")
//	public List<Emp> getAll(){
//		return service.getAll();
//	}
//	
//	@PutMapping("/")
//	public Emp update(@RequestBody Emp emp){
//		return service.update(emp);
//	}
//	
//	@DeleteMapping("/")
//	public void delete(@RequestBody Emp emp)
//	{
//		service.delete(emp);
//	}
//}
