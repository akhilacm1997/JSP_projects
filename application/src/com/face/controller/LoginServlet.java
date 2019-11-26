package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;

import com.face.dao.LoginDAO;

import com.face.util.ConnectionManager;

/**
/ * @author Akhila
 * Action Servlet implementation class to perform user registration
 * Date-14-11-2019
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		
		LoginBO regbo = new LoginBO();
		
		regbo.setName(name);
		regbo.setPassword(password);
		ConnectionManager con=new ConnectionManager();

		boolean check=false;
		
		try {
			check=LoginDAO.save(con.getConnection(),regbo);//calling excution query class
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	if(check==true)
	{
		//response.sendRedirect("Welcome.jsp");
			
			  ArrayList<String> list=new ArrayList<String>(); 
			  list.add(regbo.getName());
			 list.add(regbo.getEmail()); 
			 list.add(regbo.getMobile());
			 
		String a=regbo.getName();
		String e=regbo.getEmail();
		String m=regbo.getMobile();
		System.out.println(e);
			/*
			 * PrintWriter out=response.getWriter(); out.println("name    :"+a);
			 * 
			 * 
			 * out.println("email    :"+e);
			 */		 
			
			
			  request.setAttribute("data",e);
			  request.setAttribute("data1",a);
			 request.setAttribute("data2",m);
			 
		  // request.setAttribute("data",list);
			  RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp"); 
			  rd.forward(request,response);
			 
		//response.sendRedirect("Welcome.jsp?n=+a");
		  
		//  out.println("mobile    :"+mobile1);
		 
		//name1=request.getParameter("name").toString();
		
				
	}
	else {
		 request.setAttribute("data2","invalid password or username"); 
		  RequestDispatcher rd=request.getRequestDispatcher("login.jsp"); 
		  rd.forward(request,response);
	}
	}
	

}
