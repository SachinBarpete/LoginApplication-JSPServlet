/**
 * @author : Sachin Barpete
 * @purpose : for Establishing the connection of MySQL database
 */
package com.bridgelabz.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	public static Connection connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginAPI", "root", "password");
			return con;
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
		return null;
	}

}