package com.javatechie.es.api.repository.elasticsearch;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.javatechie.es.api.model.Student;

public interface StudentRepository extends ElasticsearchRepository<Student, String>{

	List<Student> findByName(String name);

}
