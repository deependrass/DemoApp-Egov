package deep.com.ServiceImplementations;

import java.util.ArrayList;
import java.util.List;

import deep.com.EmployeeInterfaces.EmployeeInterface;
import deep.com.Models.Employee;

public class AddEmployees implements EmployeeInterface{
	
	public List<Employee> EmployeeObj;
	
	public List<Employee> addEmployees()
	{  
		EmployeeObj=new ArrayList<Employee>();
	
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		emp1.setName("Deependra Singh");
		emp1.setAddress("Koramangala");
		
		emp2.setName("Rajveer Singh");
		emp2.setAddress("JayaNagar");
		
		EmployeeObj.add(emp1);
		EmployeeObj.add(emp2);
		
		return EmployeeObj;
		
	}

}
