package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.AdminBO;
import com.face.bo.CityBO;
import com.face.dao.AdminDAO;
import com.face.dao.CityDAO;
import com.face.util.ConnectionManager;

/**
 * Servlet implementation class CityServelt
 */
/* @WebServlet("/CityServelt") */
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  //select html file
		String city=request.getParameter("city");
		System.out.println(city);
		CityBO adbo = new CityBO();
		
		ConnectionManager con=new ConnectionManager();
		ArrayList<String> list=new ArrayList<String>(); 

		if(city.equals("thrissur"))
		{
			System.out.println(city);
			adbo.setThrissur(city);
			try {
				list=CityDAO.thrissur(con.getConnection(),adbo);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("data",list);
			  RequestDispatcher rd=request.getRequestDispatcher("Thrissur.jsp"); 
			  rd.forward(request,response);
		}
		for(int i = 0; i < list.size(); i++) {   
		    System.out.print(list.get(i));
		}
	}

}
