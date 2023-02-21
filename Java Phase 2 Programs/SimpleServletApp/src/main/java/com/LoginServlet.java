package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		response.setContentType("text/html");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("pass");
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
	pw.println("Successfully login with get method");
			rd1.forward(request, response);
		}else {
			pw.println("failure try once again with get method");
			rd2.include(request, response);
		}		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		response.setContentType("text/html");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("pass");
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			pw.println("Successfully login with post method");
			rd1.forward(request, response);
		}else {
			pw.println("failure try once again with post method");
			rd2.include(request, response);
		}
	}

}
