package com.face.controller;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.PlayerBO;





public class PlayerDAO {

	//public static void save(Connection connection, PlayerBO pb) {
		
	public static void save(Connection connection, PlayerBO pb) throws SQLException {
		// TODO Auto-generated method stub
		
		 Statement st=connection.createStatement();
	        String query="INSERT INTO player(name,country,skill_id,team_id) values('"+pb.getPlayerName()+"','"+pb.getCountry()+"','"+pb.getSkillid()+"','"+pb.getTeamid()+"')";
	        
	        int resultset=st.executeUpdate(query);
			
			
	        if(resultset==1)
	            System.out.println("Data inserted Suceesfully");
	        else
	            System.out.println("Please check");
	        
	    }

	public static void display(Connection connection) throws SQLException {
		
		  Statement st=connection.createStatement();
	        String query="SELECT P.id,P.name,P.country,S.name,T.name FROM player P INNER JOIN skill S  INNER JOIN team T ON S.id=P.skill_id AND T.id=P.team_id";
	        ResultSet rs=st.executeQuery(query);
	        
	        System.out.println("srno \t name \t country \t skill \t\t  Team");
	        while(rs.next())
	        {
	            System.out.print(rs.getInt(1)+"\t");System.out.print(rs.getString(2)+"\t");
	            System.out.print(rs.getString(3)+"\t\t");System.out.print(rs.getString(4)+"\t\t");
	            System.out.print(rs.getString(5)+"\t\t");
	            System.out.println();
	        }
	        
	    }

	public static void search(Connection connection, PlayerBO pb) throws SQLException {
		
		int skillid=pb.getSkillid();
		int status = 0;
		 Statement st=connection.createStatement();
		String query="SELECT *FROM player WHERE skill_id='"+skillid+"'";
		System.out.println(query);
		ResultSet rs= st.executeQuery(query) ;
		//LoginBO regbo1 = new LoginBO();
		while(rs.next())
		{
			
			
			System.out.print(rs.getString("name")+"  ");
			System.out.println(rs.getString("country"));
		
		
		
	}

		
	}
		
		
	}




	
	


