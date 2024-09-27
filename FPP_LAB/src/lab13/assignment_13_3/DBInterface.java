package lab13.assignment_13_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInterface {

	private Connection con;
	private String dburl = "jdbc:mysql://localhost:3306/FPPDB";
	private String username = "app";
	private String password = "password";
	
	public DBInterface() {
		// TODO Auto-generated constructor stub
	}
	
	public void connect() {
		try {
			con = DriverManager.getConnection(dburl, username, password);
			System.out.println("connected");
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void disconnect() {
		try {
			con.close();
			System.out.println("disconnected");
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public People getInfo(String id) {
		People people = null;
		try {
			Statement stmt = con.createStatement();
			String query = "SELECT person.id, firstname, lastname, ssn, street, city, state, zip FROM person, address WHERE person.id = address.id AND person.id = " + id;
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				people = new People();
				people.id = rs.getString("id");
				people.firstName = rs.getString("firstname");
				people.lastName = rs.getString("lastname");
				people.ssn = rs.getString("ssn");
				people.street = rs.getString("street");
				people.city = rs.getString("city");
				people.state = rs.getString("state");
				people.zip = rs.getString("zip");
				
				return people;
			} else {
				System.out.println("No records found");
			}
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
		
		return people;
	}
	
	public void addNew(People people) {
		try {
			Statement stmt = con.createStatement();
			StringBuilder buf = new StringBuilder();
			buf.append("INSERT INTO PERSON (firstname, lastname, ssn) ");
			buf.append("VALUES (");
			buf.append("'" + people.firstName + "', ");
			buf.append("'" + people.lastName + "', ");
			buf.append("'" + people.ssn + "');");
			
			System.out.println(buf.toString());
			
			stmt.executeUpdate(buf.toString());
		
			buf = new StringBuilder();
			buf.append("SELECT id FROM person WHERE ");
			buf.append("firstname = '" + people.firstName + "'");
			buf.append(" AND ");
			buf.append("lastname = '" + people.lastName + "'");
			buf.append(" AND ");
			buf.append("ssn = '" + people.ssn + "';");
			
			System.out.println(buf.toString());
			
			ResultSet rs = stmt.executeQuery(buf.toString());
			
			String id = null;
			if (rs.next()) {
				id = rs.getString("id");
			}
					
			buf = new StringBuilder();
			buf.append("INSERT INTO ADDRESS (id, street, city, state, zip) VALUES ('");
			buf.append(id + "', '");
			buf.append(people.street + "', '");
			buf.append(people.city + "', '");
			buf.append(people.state + "', '");
			buf.append(people.zip + "');");
			
			System.out.println(buf.toString());
			
			stmt.executeUpdate(buf.toString());
			
			stmt.close();
		}
		catch (SQLException s) {
			s.printStackTrace();
		}
		
	}
}
