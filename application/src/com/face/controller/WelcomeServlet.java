package com.face.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.bo.RegisterBO;
import com.face.bo.WelcomeBO;
import com.face.dao.LoginDAO;
import com.face.dao.WelcomeDAO;
import com.face.util.ConnectionManager;

/**
 * Servlet implementation class WelcomeServlet
 */

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html"); // select html file
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		WelcomeBO wegbo = new WelcomeBO();
		RegisterBO regbo1 = new RegisterBO();
		String namelogin = regbo1.getName();
		System.out.println("login name" + namelogin);

		wegbo.setName(name);
		wegbo.setPassword(password);
		System.out.println("name from login" + name);
		ConnectionManager con = new ConnectionManager();

		LoginDAO ldao = new LoginDAO();
		/*
		 * String name1=ldao.loginname; String email1=ldao.loginemail; String
		 * mobile1=ldao.loginmobile; P rintWriter out=response.getWriter();
		 * out.println("name    :"+name1);
		 * 
		 * 
		 * out.println("email    :"+email1);
		 * 
		 * out.println("mobile    :"+mobile1);
		 */

		try {
			WelcomeDAO.save(con.getConnection(), wegbo);// calling excution query class
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
