package com.javatechie.es.api.repository.elasticsearch;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.javatechie.es.api.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String>{

	List<Customer> findByFirstname(String firstName);

}
