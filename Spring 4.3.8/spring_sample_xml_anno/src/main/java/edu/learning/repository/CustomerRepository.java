package edu.learning.repository;

import java.util.List;

import edu.learning.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}