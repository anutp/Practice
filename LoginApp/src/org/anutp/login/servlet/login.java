package org.anutp.login.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.anutp.login.dto.User;
import org.anutp.login.service.LoginService;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LoginService login = new LoginService();
		boolean result = login.authenticate(request, response);
		
		if(result){
			response.sendRedirect("Success.jsp");
		}
		else{
			response.sendRedirect("LoginJSP.jsp");
		}
			
		
		
		
//		if(result){
//			
//			User user = login.getRequestDetails(userId);
//			request.getSession().setAttribute("userId", user.getUserId());
//			response.sendRedirect("Success.jsp");
//			
//			request.setAttribute("user", user);
//			RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
//			dispatcher.forward(request, response);
//			
//			return;
//		}
//		else
//		{
//			response.sendRedirect("LoginJSP.jsp");
//			return;
//		}
//			
	}

}
