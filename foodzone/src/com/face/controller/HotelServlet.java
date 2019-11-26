package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.AdminBO;
import com.face.bo.FoodBO;
import com.face.bo.HotelBO;
import com.face.bo.PlaceBO;
import com.face.dao.AdminDAO;
import com.face.dao.HotelDAO;
import com.face.util.ConnectionManager;

/**
 * Servlet implementation class HotelServlet
 */

public class HotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HotelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  //select html file
		String hotelname=request.getParameter("hotelname");
		String hotelid=request.getParameter("hotelid");
		String hotellocation=request.getParameter("hotellocation");
		String workingtime=request.getParameter("workingtime");
		String foods=request.getParameter("foods");
		String vegnon=request.getParameter("veg/non");
		String feedback=request.getParameter("feedback");
		
		HotelBO hbo = new HotelBO();
		PlaceBO pbo= new PlaceBO();
		FoodBO fbo= new FoodBO();
		fbo.setFoodName(foods);
		pbo.setPlaceName(hotellocation);
		
		pbo.setPlaceName(hotellocation);
	
		hbo.setHotelname(hotelname);
		hbo.setHotelid(hotelid);
		//hbo.setHotellocation(hotellocation);
		hbo.setWorkingtime(workingtime);
		//hbo.setFoods(foods);
		hbo.setVegnon(vegnon);
		hbo.setFeedback(feedback);
	
		
		ConnectionManager con=new ConnectionManager();
		try {
			HotelDAO.save(con.getConnection(),hbo);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("Hotel.jsp"); 
		  rd.forward(request,response);
		
	}

}
