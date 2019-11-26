package com.face.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.HotelBO;

public class HotelDAO {

	public static void save(Connection connection, HotelBO hbo) throws SQLException {

		Statement smt = connection.createStatement();
		String query = "insert into hoteldetails values('"+hbo.getHotelname()+"','"+hbo.getHotelid() + "','"
				+  hbo.getHotellocation() + "','" +  hbo.getWorkingtime() + "','" +  hbo.getFoods() + "','"
				+  hbo.getVegnon() + "','" +  hbo.getFeedback() + "')";
		int result = smt.executeUpdate(query);
		if (result == 1) {
			System.out.println("Data inserted successfully");
		}

		else {
			System.out.println("no data inserted");
		}
		
	}

	
		// TODO Auto-generated method stub
		
	}


