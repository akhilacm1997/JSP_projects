package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.AdminBO;
import com.face.dao.AdminDAO;

import com.face.util.ConnectionManager;

/**
 * Servlet implementation class AdminServlet
 */
/* @WebServlet("/AdminServlet") */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
			response.setContentType("text/html");  //select html file
			String id=request.getParameter("id");
			String password=request.getParameter("password");
			AdminBO adbo = new AdminBO();
			
			adbo.setId(id);
			adbo.setPassword(password);
			
			ConnectionManager con=new ConnectionManager();
			
			boolean check=false;
			
			try {
				check=AdminDAO.save(con.getConnection(),adbo);//calling excution query class
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		if(check==true)
		{
			
	}


	}
}
