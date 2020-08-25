package citi.devops.dashboard.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import citi.devops.dashboard.model.Emp;

@Repository
public interface EmpRepo extends MongoRepository<Emp, String>{

}
