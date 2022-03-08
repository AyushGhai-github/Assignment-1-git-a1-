package com.springboot.assignmnet5;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class EmployeeService {
	@PersistenceContext
	EntityManager entityManager;
	
	public Employee FindByID(int id)
	{
		return entityManager.find(Employee.class,id);
	}
	public Employee update(Employee Employee1)
	{
		return entityManager.merge(Employee1);
			
	}
	public Employee insert( Employee Employee1)
	{
		return entityManager.merge(Employee1);
			
	}
	public void Delete(int id)
	{
		 Employee Employee1 = FindByID(id);
		entityManager.remove(Employee1);
	}
}
//	public List< Employee>Findall()
//	{
//		TypedQuery <Employee> NamedQuery = entityManager.createNamedQuery("find all",person.class);
//		return  NamedQuery.getResultList() ;
//	}
