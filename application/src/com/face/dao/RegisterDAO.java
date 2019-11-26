package com.face.dao;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.RegisterBO;


public class RegisterDAO {

	public static void save(Connection connection, RegisterBO regbo) throws SQLException {

		Statement smt = connection.createStatement();
		String query = "insert into registration values('" + regbo.getName() + "','" + regbo.getEmail() + "','"
				+ regbo.getPassword() + "','" + regbo.getRepeatepassword() + "','" + regbo.getDateofbirth() + "','"
				+ regbo.getMobile() + "')";
		int result = smt.executeUpdate(query);
		if (result == 1) {
			System.out.println("Data inserted successfully");
		}

		else {
			System.out.println("no data inserted");
		}
		/*
		 * String sql="SELECT * FROM registration"; ResultSet rs1=null; try {
		 * 
		 * rs1 = smt.executeQuery(sql); } catch (SQLException e1) { // TODO
		 * Auto-generated catch block e1.printStackTrace(); }
		 * 
		 * int a=0; while(rs1.next()) { String name = rs1.getString("name"); String
		 * email = rs1.getString("email"); String password = rs1.getString("password");
		 * String repeatepassword = rs1.getString("repeatepassword"); String dateofbirth
		 * = rs1.getString("dateofbirth"); String mobile = rs1.getString("mobile");
		 * System.out.println("Name:            "+name);
		 * System.out.println("Email:           "+email);
		 * System.out.println("DOB              "+dateofbirth);
		 * System.out.println("Moblile          "+mobile); System.out.println("  ");
		 * 
		 * }
		 */

	}

	/*
	 * public static RegisterBO get(String name) { //Statement smt=
	 * connection.createStatement(); //String
	 * query="insert into registration values('"+regbo.getName()+"','"+regbo.
	 * getEmail()+"','"+regbo.getPassword()+"','"+regbo.getRepeatepassword()+"','"+
	 * regbo.getDateofbirth()+"','"+regbo.getMobile()+"')"; PreparedStatement
	 * st=con.getConnection().preparedStatement(sql); st.setString(1, name);
	 * RegisterBO regbo=new RegisterBO(); String name1=regbo.getName(); String
	 * password=regbo.getPassword(); int status = 0; ResultSet rs=st.executeQuery();
	 * //ResultSet rs= smt.executeQuery("select * from registration") ; //LoginBO
	 * regbo1 = new LoginBO(); while(rs.next()) {
	 * 
	 * System.out.println(name); System.out.println(password);
	 * System.out.println(rs.getString("name"));
	 * System.out.println(rs.getString("password"));
	 * 
	 * if(rs.getString("name").equals(name)&&(rs.getString("password").equals(
	 * password))) {
	 * 
	 * System.out.println(rs.getString("name"));
	 * System.out.println(rs.getString("password"));
	 * 
	 * 
	 * String loginname=rs.getString("name"); String
	 * loginemail=rs.getString("email"); String loginmobile=rs.getString("mobile");
	 * 
	 * regbo.setName( loginname); regbo.setEmail(loginemail);
	 * regbo.setMobile(loginmobile); status =1; }
	 * 
	 * 
	 * } return regbo;
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
