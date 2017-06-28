package deep.com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import deep.com.Models.EmployeeData;
import deep.com.DbConnection.*;
import deep.com.Models.EmployeeData;

@Service
public class testService {

	GetConnection getConObj;
	Connection con;
	ResultSet rs;

	public void display() {
		System.out.println("Inside Service");
	}

	public String validate(EmployeeData emp) {
		String Name = emp.getName();
		String password = emp.getAddress();

		System.out.println("From:Service:: Got AJAX CALL::::  Name is: " + Name + " Address: " + password);
		String status = "";
/*
		getConObj = new GetConnection();
		con = getConObj.getConnection();
		String Query = "select * From employeeTest";
		try {
			Statement st = con.createStatement();
			rs = st.executeQuery(Query);
			
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				
				
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

*/		if (Name.equalsIgnoreCase("Deependra") && password.equalsIgnoreCase("Singh1234")) {
			status = "Ok";
		} else {
			status = "NotOk";
		}
		return status;

	}

}
