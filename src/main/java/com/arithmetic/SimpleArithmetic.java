package com.arithmetic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleArithmetic
 */
@WebServlet("/SimpleArithmetic")
public class SimpleArithmetic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleArithmetic() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		String operation = request.getParameter("operations");
		
		System.out.println("The operations is: " + operation);
		
		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		
		RequestDispatcher rd = null;
		
		switch (operation) {
			case "addition":
				rd = request.getRequestDispatcher("add");
				break;
			case "subtraction":
				rd = request.getRequestDispatcher("subtraction");
				break;
			case "multiplication":
				rd = request.getRequestDispatcher("multiplication");
				break;
			case "division":
				rd = request.getRequestDispatcher("division");
				break;
			case "square":
				rd = request.getRequestDispatcher("add");
				break;
		}
		
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}