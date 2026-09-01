package com.tejas;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet{

	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
//		Session 
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("sum");
		int k = 0;
	 Cookie cookie [] =	req.getCookies();
		 for(Cookie c : cookie) {
			 if(c.getName().equals("sum")) {
				 k=Integer.parseInt(c.getValue());
			 }
		 }
		k = k*k;
		
		PrintWriter out =	res.getWriter();
		out.println("Result is "+k);
		
		
		//int k = (int) req.getAttribute("sum");
//		int k =Integer.parseInt(req.getParameter("sum"));	
//		PrintWriter out =	res.getWriter();
//		out.println("Result is "+k);
	}
}
