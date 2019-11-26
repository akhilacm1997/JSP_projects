package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.LoginBO;
import com.face.bo.WelcomeBO;

public class WelcomeDAO {
public static Boolean save(Connection connection, WelcomeBO wegbo)  throws SQLException {
		
		Statement smt= connection.createStatement();
		//String query="insert into registration values('"+regbo.getName()+"','"+regbo.getEmail()+"','"+regbo.getPassword()+"','"+regbo.getRepeatepassword()+"','"+regbo.getDateofbirth()+"','"+regbo.getMobile()+"')";
		LoginBO legbo =  new LoginBO();
		String loginname=legbo.getName();
		System.out.println("loginname"+loginname);
		String name=wegbo.getName();
		String password=wegbo.getPassword();
		int status = 0;
		ResultSet rs= smt.executeQuery("SELECT * FROM registration") ;
		
		while(rs.next())
		{
			//System.out.println(name);
			/*
			 * System.out.println(password);
			 * System.out.println("welcome name  :  "+rs.getString("name"));
			 * System.out.println("welcome pwd   :  "+rs.getString("password"));
			 */
			/*if(rs.getString("name").equals(name)&&(rs.getString("password").equals(password)))
			{
				*//*
				 * System.out.println(rs.getString("name"));
				 * System.out.println(rs.getString("password"));
				 */
				 status =1;
			/* } */
		

}
		return null;
}
}
