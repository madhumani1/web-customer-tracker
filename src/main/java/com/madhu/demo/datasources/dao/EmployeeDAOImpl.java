/**
 * 
 */
package com.madhu.demo.datasources.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Transactional;

import com.madhu.demo.datasources.entity.Employee;

/**
 * @author 15197
 * @Repository – It is used for DAO implementations.  
 * It will automatically register DAO implementation (Thanks to component scanning). 
 * In addition, Spring also provides translation of any JDBC related exceptions. 
 * @Repository and @Controller annotations are inherited from @Component.
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	// need to inject the session factory
	@Autowired
	@Qualifier("employeeSessionFactory")
	private SessionFactory sessionFactory;
	
	/**
	 * Spring provides a special annotation @Transactional which automagically begins and end a transaction for our Hibernate code.
	 * * no need for us to explicitly do this in your code
	 * 
	 * The Spring magic happens behind the scenes.
	 * 
	 * This is in place of session.beginTransaction(); -> DO HIBERATE STUFF -> session.getTransaction(). commit()
	 * 
	 * If you are using Service class, then remove @transactional, 
	 * because we want this DAO implementation to run in the context of the transaction 
	 * that was defined by the service layer. 
	 */
	@Override
	@Transactional("employeeTransactionManager")
	public List<Employee> getEmployees() {
		// get the current Hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
		Query<Employee> theQuery = currentSession.createQuery("from Employee order by lastName", Employee.class);
		
		// execute query and get result list
		List<Employee> employees = theQuery.getResultList();
		
		// return results
		return employees;
	}

}
