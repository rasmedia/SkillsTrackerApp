package com.perficient.skillstracker.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.perficient.skillstracker.model.Employee;


@Repository
public interface EmployeeRepo 
			extends CrudRepository<Employee, Long> {

}



