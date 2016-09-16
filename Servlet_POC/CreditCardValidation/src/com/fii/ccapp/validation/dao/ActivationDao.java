package com.fii.ccapp.validation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fii.ccapp.validation.model.CreditCard;
import com.fii.ccapp.validation.model.Customer;

/**
 * @author Shravya Peddiraju
 */
public class ActivationDao {
	
	public static Customer validateDetails(CreditCard cc) {
		
	CreditCard c = new CreditCard();
	
	Customer cm = new Customer();
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "creditcard";
	String driver = "com.mysql.jdbc.Driver";
	String userName = "root";
	String password = "admin";
	
	try {
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(url + dbName, userName, password);

		ps = conn.prepareStatement("select name,lastname,email,phone,number from user join creditcard on user.pid = creditcard.cid where number=?");
		
		ps.setString(1, cc.getcardNumber());

		rs = ps.executeQuery();
		
		while(rs.next()){
			
			cm.setFName(rs.getString("name"));
			c.setcardNumber(rs.getString("number"));
			cm.setLName(rs.getString("lastname"));
			cm.setEmail(rs.getString("email"));
			cm.setContact(rs.getString("phone"));
			cm.setCard(c);
			}
	}catch (Exception e) {
		System.out.println(e);
	} finally {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	  }
	return cm;
	}
}
