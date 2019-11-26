package com.face.controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.SkillBO;

public class SkillDAO {

	public static int save(Connection connection, SkillBO sb) throws SQLException
	{

		Statement smt= connection.createStatement();
		//String query="insert into registration values('"+regbo.getName()+"','"+regbo.getEmail()+"','"+regbo.getPassword()+"','"+regbo.getRepeatepassword()+"','"+regbo.getDateofbirth()+"','"+regbo.getMobile()+"')";
		
		String skillName=sb.getSkillName();
		int status = 0;
		int id = 0;
		String query="SELECT *FROM skill WHERE name='"+skillName +"'";
		System.out.println(query);
		ResultSet rs= smt.executeQuery(query) ;
		//LoginBO regbo1 = new LoginBO();
		while(rs.next())
		{
			
			
		id =rs.getInt("id");
		
		break;
		
	}

	   return id;

}

	
}
		

