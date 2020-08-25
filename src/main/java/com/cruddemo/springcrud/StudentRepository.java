package com.cruddemo.springcrud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cruddemo.springcrud.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
