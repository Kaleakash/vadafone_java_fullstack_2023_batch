package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.entity.Product;
import com.service.ProductService;

public class App {

	public static void main(String[] args) {
		ProductService ps = new ProductService();
		int choice;
		int pid;
		String name;
		float price;
		String result;
		String con;
		Scanner sc = new Scanner(System.in);
		do {
System.out.println("1:Add Product 2 : Increment Price 3 :Decrement Price 4: delete product \n5: find product 6: find all product");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Add product details");
				  System.out.println("Enter the product name");
				  name = sc.next();
				  System.out.println("Enter the product price");
				  price = sc.nextFloat();
				  Product p = new Product();
				  p.setPname(name);
				  p.setPrice(price);
				  result = ps.storeProduct(p);
				  System.out.println(result);
				  break;
			case 2: System.out.println("increment product price");
					System.out.println("Enter the product pid");
					pid = sc.nextInt();
					System.out.println("Enter the product price");
					price= sc.nextFloat();
					Product p1 = new Product();
					p1.setPid(pid);
					p1.setPrice(price);
					result = ps.incrementProductPrice(p1);
					System.out.println(result);
					break;
					
			case 3: System.out.println("decrement product price");
				System.out.println("Enter the product pid");
				pid = sc.nextInt();
				System.out.println("Enter the product price");
				price= sc.nextFloat();
				Product p2 = new Product();
			p2.setPid(pid);
			p2.setPrice(price);
			result = ps.decrementProductPrice(p2);
			System.out.println(result);		
					break;
			case 4:System.out.println("Delete record");
			       System.out.println("Enter the product id to delete");
			       pid = sc.nextInt();
			       result = ps.deleteProduct(pid);
			       System.out.println(result);
			       break;
			case 5 :System.out.println("find product details");
			       System.out.println("enter the product id");
			       pid = sc.nextInt();
			       result = ps.findProduct(pid);
			       System.out.println(result);
			       break;
			case 6:System.out.println("find all product details");
			       List<Product> listOfProduct = ps.findAllProduct();
			       Iterator<Product> li = listOfProduct.iterator();
			       while(li.hasNext()) {
			    	   Product pp = li.next();
			    	   System.out.println(pp);
			       }
			       break;
			       
			       
			default:System.out.println("Wrong choice");
			     break;
			}
			System.out.println("Do you want to continue?(yes/no)");
		con = sc.next();
		} while (con.equalsIgnoreCase("yes"));
		System.out.println("Thank you!");
		
		sc.close();
	}

}
