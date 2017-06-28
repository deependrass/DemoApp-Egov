package deep.com.DbConnection;


import java.sql.*;

public class GetConnection {
	Connection con;

	public Connection getConnection() {

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyDb", "postgres", "postgres");
			// stmt = con.createStatement();
			System.out.println("Opened database successfully");

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());

		}

		return con;

	}

}
