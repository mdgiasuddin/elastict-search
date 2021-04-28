package com.javatechie.es.api.controller;

import com.javatechie.es.api.model.Student;
import com.javatechie.es.api.model.StudentAll;
import com.javatechie.es.api.repository.elasticsearch.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @PostMapping("/new")
    public Integer saveCustomer(@RequestBody List<Student> students) {
        repository.saveAll(students);
        return students.size();
    }

    @GetMapping("/all")
    public Iterable<Student> findAllCustomers() {
        return repository.findAll();
    }

    @GetMapping("/all/{name}")
    public StudentAll findByFirstName(@PathVariable("name") String name) {
        return new StudentAll(repository.findByName(name));
    }

}
