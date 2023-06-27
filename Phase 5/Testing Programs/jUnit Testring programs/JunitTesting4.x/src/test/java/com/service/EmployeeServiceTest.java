package com.service;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import com.bean.Employee;
public class EmployeeServiceTest {
	static EmployeeService es;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		es = new EmployeeService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		es  = null;  // GC 
	}
	@Test
	//@Ignore
	public void testGetEmployee() {
		Employee e = es.getEmployee();
		assertNotNull(e);
		assertEquals(e.getId(), 100);
		assertEquals(e.getName(), "Lex");
		assertEquals(e.getSalary(), 16000,0.0);    // 3rd parameter delta till what decimal point we need to check
	}
	@Test
	//@Ignore
	public void testGetAllEmployees() {
		List<Employee> listOfEmp = es.getAllEmployees();
		assertEquals(3, listOfEmp.size());
		Employee emp = listOfEmp.get(0);
		assertEquals(emp.getId(), 100);
		assertEquals(emp.getName(), "Lex");
		assertEquals(emp.getSalary(), 16000,0.0); 
	}
	@Test
	//@Ignore
	public void testUpdateSalary() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(16000);
		float salary = es.updateSalary(emp);
		assertEquals(21000, salary,0.0);
	}

	@Test
	public void testCheckUser() {
		boolean result1 = es.checkUser("akash@gmail.com","123");
		boolean result2 = es.checkUser("raj@gmail.com", "12122");
		assertTrue(result1);
		assertFalse(result2);
	}

	
}



