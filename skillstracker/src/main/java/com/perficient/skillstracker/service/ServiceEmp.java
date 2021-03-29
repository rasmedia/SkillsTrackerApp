package com.perficient.skillstracker.service;




import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perficient.skillstracker.exception.NoDataFound;
import com.perficient.skillstracker.model.Employee;
import com.perficient.skillstracker.repository.EmployeeRepo;



@Service
public class ServiceEmp {
	
	@Autowired
	EmployeeRepo repository;
	
	public List<Employee> getAllEmployees()
	{
		System.out.println("getAllEmployees");
		List<Employee> result = (List<Employee>) repository.findAll();
		
		if(result.size() > 0) {
			return result;
		} else {
			return new ArrayList<Employee>();
		}
	}

	
	public Employee getEmployeeById(Long id) throws NoDataFound 
	{
		System.out.println("getEmployeeById");
		Optional<Employee> employee = repository.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
		} else {
			throw new NoDataFound("No employee record exist for given id");
		}
	}
	
	public Employee createOrUpdateEmployee(Employee entity) 
	{
		System.out.println("createOrUpdateEmployee");
		// Create new entry 
		if(entity.getId()  == null) 
		{
			entity = repository.save(entity);
			
			return entity;
		} 
		else 
		{
			// update existing entry 
			Optional<Employee> employee = repository.findById(entity.getId());
			
			if(employee.isPresent()) 
			{
				Employee newEntity = employee.get();
				newEntity.setFirstName(entity.getFirstName());
				newEntity.setLastName(entity.getLastName());
				newEntity.setStreet(entity.getStreet());
				newEntity.setSuite(entity.getSuite());
				newEntity.setCity(entity.getCity());
				newEntity.setRegion(entity.getRegion());
				newEntity.setPostal(entity.getPostal());
				newEntity.setCountry(entity.getCountry());
				newEntity.setContactEmail(entity.getContactEmail());
				newEntity.setCompanyEmail(entity.getCompanyEmail());
				newEntity.setBirthDate(entity.getBirthDate());
				newEntity.setHireDate(entity.getHireDate());
				newEntity.setRole(entity.getRole());
				newEntity.setBusinessUnit(entity.getBusinessUnit());
				newEntity.setFieldName(entity.getFieldName());
				newEntity.setFieldType(entity.getFieldType());
				newEntity.setExperience(entity.getExperience());
				newEntity.setSummary(entity.getSummary());
				
				newEntity = repository.save(newEntity);
				
				return newEntity;
			} else {
				entity = repository.save(entity);
				
				return entity;
			}
		}
	} 
	
	public void deleteEmployeeById(Long id) throws NoDataFound 
	{
		System.out.println("deleteEmployeeById");
		
		Optional<Employee> employee = repository.findById(id);
		
		if(employee.isPresent()) 
		{
			repository.deleteById(id);
		} else {
			throw new NoDataFound("No employee record exist for given id");
		}
	} 
}