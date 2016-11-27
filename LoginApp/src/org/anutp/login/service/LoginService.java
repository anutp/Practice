package org.anutp.login.service;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.anutp.login.dto.User;

public class LoginService {
	
//
//	public LoginService(){
//		HashMap<String, String> hashmap = new HashMap<String, String>();
//		hashmap.put("anutp", "value");
//		hashmap.put("chinnutp", "value");
//	}
	
	public boolean authenticate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String myinfoCookie = null;
		boolean flag = false;
		Cookie[] cookies = request.getCookies();
		System.out.println("Cookie size in authenticate: " +cookies.length);
		for(Cookie cookie: cookies){
			if(cookie.getValue().equals("macuat")){
				myinfoCookie = cookie.getValue();
				cookie.setMaxAge(10);
				response.addCookie(cookie);
				flag = true;
				request.getSession().setMaxInactiveInterval(15);
				System.out.println("Cookie age of myinfoCookie: " +cookie.getMaxAge());
			}
		}
		
		if(myinfoCookie == null){
			request.getSession().invalidate();
			request.getRequestDispatcher("SessionExpire.jsp").forward(request, response);
			return false;
		}
		if(flag == true){
			request.getSession().setAttribute("UserName", "Anu T P");		
			return true;
		}
		
		return false;
		
	}
	
//	public User getRequestDetails(String userId){
//		User user = new User();
//		user.setUserId(userId);
//		return user;
//	}
}
