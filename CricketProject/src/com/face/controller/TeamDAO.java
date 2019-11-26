package com.face.controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.TeamBO;
import com.face.util.ConnectionManager;

public class TeamDAO {
	
	
	public static int save(Connection connection, TeamBO tb) throws SQLException {
		Statement smt= connection.createStatement();
		//String query="insert into registration values('"+regbo.getName()+"','"+regbo.getEmail()+"','"+regbo.getPassword()+"','"+regbo.getRepeatepassword()+"','"+regbo.getDateofbirth()+"','"+regbo.getMobile()+"')";
		
		String TeamName=tb.getTeamName();
		int status = 0;
		int id = 0;
		String query="SELECT *FROM team WHERE name='"+TeamName +"'";
		System.out.println(query);
		ResultSet rs= smt.executeQuery(query) ;
		//LoginBO regbo1 = new LoginBO();
		while(rs.next())
		{
			
			
		id =rs.getInt("id");
		System.out.println(id);
		
		break;
		
		}

	   return id;
	}

}
