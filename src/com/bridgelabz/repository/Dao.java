/**
 * @author : Sachin Barpete
 * @purpose : Dao layer for CRUD operations
 */
package com.bridgelabz.repository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.bridgelabz.model.User;

public class Dao {

	public boolean verifyLogin(String uname, String pass) {
		try {
			String sql = "select * from user where username=? and password=?";
			Connection con = JDBCConnection.connection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, uname);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			if (rs.next())
				return true;
			rs.close();
			pst.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
		return false;
	}

	public boolean registerUser(User user) {

		try {
			String sql = "insert into user values (?,?,?,?,?,?)";

			Connection con = JDBCConnection.connection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getName());
			pst.setLong(3, user.getMobileNo());
			pst.setString(4, user.getEmail());
			pst.setString(5, user.getAddress());
			pst.setString(6, user.getPassword());
			pst.executeUpdate();
			pst.close();
			con.close();
			return true;
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
		return false;
	}

	public boolean forgottPassword(String uname, String email) {
		try {
			String sql = "select * from user where username =? and email =?";
			Connection con = JDBCConnection.connection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, uname);
			pst.setString(2, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next())
				return true;
			rs.close();
			pst.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
		return false;
	}

	public boolean updatePassword(String uname, String email, String pass) {

		try {
			int count = 0;
			String sql = "update user set password =? where username =? and email =?";
			Connection con = JDBCConnection.connection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, pass);
			pst.setString(2, uname);
			pst.setString(3, email);
			count = pst.executeUpdate();
			if (count != 0)
				return true;
			pst.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
		return false;
	}
}