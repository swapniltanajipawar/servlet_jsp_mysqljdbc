package com.swapnil.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.swapnil.web.dao.AlienDao;
import com.swapnil.web.model.Alien;

/**
 * Servlet implementation class GetAlienController
 */
public class GetAlienController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int aid = Integer.parseInt(request.getParameter("aid"));
		AlienDao dao  = new AlienDao();
		Alien a1 = dao.getAlien(aid);
		
		request.setAttribute("alien",a1);  //set attribute in the servalet and get it in the jsp using the scriplet
		
		RequestDispatcher rd= request.getRequestDispatcher("showAlien.jsp");
		rd.forward(request, response);
		
		// this will give you the data which we have to store.
		

		
		// To show the data we use the jsp page to put the data and do the design. 
		
		//How to call the jsp from the servlet using the forward using the request dispatcher.
		
	
		
		//user send the req to the index page send to the controller that same request to the jsp page.	
	}

}
