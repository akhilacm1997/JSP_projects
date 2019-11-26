package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.face.bo.CityBO;

public class CityDAO {

	

	public static ArrayList<String>  thrissur(Connection connection, CityBO adbo) throws SQLException {
		adbo.getThrissur();
		

		Statement smt= connection.createStatement();
		//String query="insert into registration values('"+regbo.getName()+"','"+regbo.getEmail()+"','"+regbo.getPassword()+"','"+regbo.getRepeatepassword()+"','"+regbo.getDateofbirth()+"','"+regbo.getMobile()+"')";
		
		
		int status = 0;
		ResultSet rs= smt.executeQuery("select * from thrissur") ;
		//LoginBO regbo1 = new LoginBO();
		
		 ArrayList<String> list=new ArrayList<String>(); 
		 
		 
		while(rs.next())
		{
			/*
			 * System.out.println(name); System.out.println(password);
			 
			 * System.out.println(rs.getString("password"));
			 */
			// System.out.println(rs.getString("hotelname"));
			 list.add(rs.getString("hotelname"));
			 
			 System.out.println("in cityDAO");
			
			}
		/*
		 * for(int i = 0; i < list.size(); i++) { System.out.print(list.get(i)); }
		 */
		return (list);  
		
		
		
	}

	
}
