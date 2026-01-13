package com.cs.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs.demo.model.Stud;

public interface Studrepo extends JpaRepository<Stud, Integer>{

}
