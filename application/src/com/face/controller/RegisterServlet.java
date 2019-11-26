package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
/ * @author Akhila
 * Action Servlet implementation class to perform user registration
 * Date-14-11-2019
 * Servlet implementation class RegisterServlet
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @implSpec ->action method to register customer with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");  //select html file
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String repeatepassword=request.getParameter("repeatepassword");
		String dateofbirth=request.getParameter("dateofbirth");
		String mobile=request.getParameter("mobile");
		
		RegisterBO regbo = new RegisterBO();
		regbo.setName(name);
		regbo.setEmail(email);
		regbo.setPassword(password);
		regbo.setRepeatepassword(repeatepassword);
		regbo.setDateofbirth(dateofbirth);
		regbo.setMobile(mobile);
		
		ConnectionManager con=new ConnectionManager();

	
			
				try {
					RegisterDAO.save(con.getConnection(),regbo);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		/*
		 * request.setAttribute("user",RegisterDAO.get(regbo.getName()));
		 * RequestDispatcher rd=request.getRequestDispatcher("NewFile.jsp");
		 * rd.forward(request, response);
		 */
		response.sendRedirect("login.jsp");
		
	}

}
