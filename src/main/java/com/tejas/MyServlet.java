package com.tejas;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet; // You can leave or remove this import
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet Config
 */
// REMOVE OR COMMENT OUT THIS ANNOTATION LINE BELOW:
// @WebServlet("/MyServlet") 
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public MyServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("Hi ");
        
        ServletConfig sconfig = getServletConfig();
        String s = sconfig.getInitParameter("supportEmail");
                
        out.println(s);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
