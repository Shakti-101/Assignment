package com.shakti.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.shakti.SpringBootCrud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {
	

}
