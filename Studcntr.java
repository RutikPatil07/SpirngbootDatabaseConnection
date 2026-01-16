package com.cs.demo.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cs.demo.model.Stud;
import com.cs.demo.repo.Studrepo;

import jakarta.validation.Valid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@RestController
public class Studcntr {
	@Autowired
	private Studrepo repo;
	
	@GetMapping("/stud")
	public List<Stud> pb(){
		List<Stud> lst=repo.findAll();
		return lst;
	} 
	
	@GetMapping("/cnt")
	public Map<String, Object> getSummary() {
	    Long total = repo.getTotalStud();
	    Map<String, Object> result = new HashMap<>();
	    result.put("total", total);
	    return result;
	}
	
	@GetMapping("/mx")
	public Map<String, Object> getMaxStud() {
	    Long total = repo.getTotalStud();
	    Map<String, Object> result = new HashMap<>();
	    result.put("total", total);
	    return result;
	}
	
	 @PostMapping("/save")
     public Stud saveStud(@Valid @RequestBody Stud p) {
	  return repo.save(p);
}

	
	@GetMapping("/cstud")
    public Map<String, List<Stud>> rpb() {
        List<Stud> list = repo.findAll();
        Map<String, List<Stud>> response = new HashMap<>();
        response.put("students", list);
        return response;
	}
	
	@GetMapping("/findById/{id}")
	public Optional<Stud> findById(@PathVariable("id") int id){
		return repo.findById(id);
	}
	  
     
     @PutMapping("/updt")
     public Stud updtps(@Valid @RequestBody Stud p) {
	  return repo.save(p);

}
     
     @DeleteMapping("/dlt/{id}")
 	public String deleteBlg(@PathVariable("id") int id) {
 		repo.deleteById(id);
 		return "Record Deleted Succesfully....!!!";
}
}
