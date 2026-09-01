package com.tejas;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.connector.Response;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i =Integer.parseInt(req.getParameter("num1"));
		
		int j = Integer.parseInt(req.getParameter("num2"));
	
			int sum = i + j ;
			
		//cookie 
//			Cookie cookie = new Cookie("sum",sum + "");
//			res.addCookie(cookie);
//			res.sendRedirect("sq");
			
			PrintWriter out =	res.getWriter();
			out.print("<html> <body bgcolor='green'>");
			out.println("Result is "+sum);
			out.print("</body></html>");	
			//Session 	
//			System.out.println("result of 2 sum is : " + sum);
//		
//			HttpSession session = req.getSession();
//			session.setAttribute("sum", sum);
//			
//			res.sendRedirect("sq");
	
			/* Request Despatcher
			 * req.setAttribute("sum", sum);
				RequestDispatcher rd = req.getRequestDispatcher("sq");  // pass this into the web.xml file tooo
				rd.forward(req, res);
			 */
			
/* 
 * For Normal Prinitng			
 *
 *		PrintWriter out =	res.getWriter();
 *		out.println("Result is "+sum);
*/
	}
	

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i =Integer.parseInt(req.getParameter("num1"));
		
		int j = Integer.parseInt(req.getParameter("num2"));
	
			int sum = i + j ;
			
			System.out.println("result of 2 sum is : " + sum);
			
		PrintWriter out =	res.getWriter();
		out.print("<hml> <body bgcolor='green'>");
		out.println("Result is "+sum);
		out.print("</body></html>");
	}

}
