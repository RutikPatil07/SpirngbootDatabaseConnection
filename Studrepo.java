package com.cs.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cs.demo.model.Stud;

public interface Studrepo extends JpaRepository<Stud, Integer>{

	 @Query(value = "SELECT COUNT(*) FROM stud", nativeQuery = true)
	 Long getTotalStud();
	 
	 @Query(value = "SELECT COUNT(*) FROM stud", nativeQuery = true)
	 Long getaxStud();
}
    
