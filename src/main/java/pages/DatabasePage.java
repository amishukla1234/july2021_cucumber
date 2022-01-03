package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	Connection connection =null;
	Statement statement = null;
	ResultSet resultSet = null;
	String columnValue ;
  public String getData (String columnName) {
	 
	  // setting properties for mysql
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sqlUrl ="jdbc:mysql://localhost:/3306/july2021";
		String sqlUserName = "root";
		String sqlPassword = "root";
		String query = "select * from users;";
		
		// create connection to local database
		 connection = DriverManager.getConnection(sqlUrl, sqlUserName, sqlPassword);
		// empowering the connection reference variable to execute queries
		 statement = connection.createStatement();
		resultSet = statement.executeQuery(query);
		
		while(resultSet.next()) {
		 columnValue = resultSet.getString(columnName);
		  return columnValue;
		}
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		if (resultSet != null) {
		try {
			resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	  
	  
 return columnValue;
  }
}
