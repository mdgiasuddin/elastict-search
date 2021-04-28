package com.javatechie.es.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName="student-data",type="student",shards=2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	private String id;
	private String name;
	private String schoolName;
	private String classId;
	private String schoolRollNo;
	private String rollNo;
	private String regNo;

}
