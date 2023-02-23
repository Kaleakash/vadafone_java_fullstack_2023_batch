package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Product;
import com.service.ProductService;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	// retrieve product details 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	response.setContentType("text/html");
	ProductService ps = new ProductService();
	List<Product> listOfProduct = ps.findAllProduct();
//	pw.println("Number of product are "+listOfProduct.size());
//	Iterator<Product> ii = listOfProduct.iterator();
//	while(ii.hasNext()) {
//		Product p = ii.next();
//		pw.println("<div>");
//		pw.println("<img src="+p.getImageUrl()+" width=100 height=100/>");
//		pw.println("<span>Pid is "+p.getPid()+" PName is "+p.getPname()+"</span>");
//		pw.println("</div>");
//	}
	request.setAttribute("listOfProduct", listOfProduct);
	RequestDispatcher rd = request.getRequestDispatcher("viewProduct.jsp");
	rd.include(request, response);
	
	}

	// store product details 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		String pname = request.getParameter("pname");
		float price = Float.parseFloat(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		String imageUrl = request.getParameter("imageUrl");
		
		Product p = new Product();
		p.setPname(pname);
		p.setPrice(price);
		p.setQuantity(quantity);
		p.setImageUrl(imageUrl);
		
		ProductService ps = new ProductService();
		String result  = ps.storeProduct(p);
		
		pw.println(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
		doGet(request, response);
		
	}

}
