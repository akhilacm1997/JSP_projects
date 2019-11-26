package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.LoginBO;


public final class LoginDAO {

	
	
	public static Boolean save(Connection connection, LoginBO regbo)  throws SQLException {
//		 String loginname;
//		 String loginemail;
//		 String loginmobile;
		
		
		Statement smt= connection.createStatement();
		//String query="insert into registration values('"+regbo.getName()+"','"+regbo.getEmail()+"','"+regbo.getPassword()+"','"+regbo.getRepeatepassword()+"','"+regbo.getDateofbirth()+"','"+regbo.getMobile()+"')";
		
		String name=regbo.getName();
		String password=regbo.getPassword();
		int status = 0;
		ResultSet rs= smt.executeQuery("select * from registration") ;
		//LoginBO regbo1 = new LoginBO();
		while(rs.next())
		{
			/*
			 * System.out.println(name); System.out.println(password);
			 * System.out.println(rs.getString("name"));
			 * System.out.println(rs.getString("password"));
			 */
			if(rs.getString("name").equals(name)&&(rs.getString("password").equals(password)))
			{
				/*
				 * System.out.println(rs.getString("name"));
				 * System.out.println(rs.getString("password"));
				 */
				
				 String  loginname=rs.getString("name");
				 String  loginemail=rs.getString("email");
				 String  loginmobile=rs.getString("mobile");
				 
				 regbo.setName( loginname);
				 regbo.setEmail(loginemail);
				 regbo.setMobile(loginmobile);
				 status =1;
			}
		
	/*		
			 String name1 = rs.getString("name");
		        
	         String password1 = rs.getString("password");
	         System.out.println(name1);
	         System.out.println(password1);
	      */   
		}
		
        boolean statuscheck=false;
		//int result=smt.executeUpdate(query);
		if( status==1)
		{
			System.out.println("login successfully");
			//response.sendRedirect("welcome.jsp");
			statuscheck=true;
			
		}
		
		else {
			System.out.println("login unsuccessfully");
		}
		return statuscheck;
}

	
		// TODO Auto-generated method stub
	
		
	}

