package com.example.cicddemo.controller;

import org.springframework.data.repository.CrudRepository;

import com.example.cicddemo.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>  
{  
}  