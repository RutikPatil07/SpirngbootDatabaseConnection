package com.cs.demo.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.demo.model.Stud;
import com.cs.demo.repo.Studrepo;
import java.util.List;
@RestController
public class Studcntr {
	@Autowired
	private Studrepo repo;
	
	@GetMapping("/stud")
	public List<Stud> pb(){
		List<Stud> lst=repo.findAll();
		return lst;
	}
	


}
