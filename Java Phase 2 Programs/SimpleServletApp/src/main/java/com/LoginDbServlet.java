package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginDbServlet
 */
public class LoginDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDbServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	// signIn
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		RequestDispatcher rd1 = request.getRequestDispatcher("logindb.html");
		RequestDispatcher rd2 = request.getRequestDispatcher("Home");
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
PreparedStatement pstmt = 
con.prepareStatement("select * from login where emailid=? and password = ?");
	pstmt.setString(1, emailid);
	pstmt.setString(2, password);
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()) {
		rd2.forward(request, response);
	}else {
		pw.print("Failure try once again");
		rd1.include(request, response);
	}
		} catch (Exception e) {
		pw.print(e);
		rd1.include(request, response);
		}
		
	}

	// signUp
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		RequestDispatcher rd1 = request.getRequestDispatcher("signup.html");
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
	pstmt.setString(1, emailid);
	pstmt.setString(2, password);
	int res = pstmt.executeUpdate();
	if(res>0) {
		pw.println("Account created successfully");
		rd1.include(request, response);
	}
		} catch (Exception e) {
		pw.print(e);
		rd1.include(request, response);
		}
	}

}
