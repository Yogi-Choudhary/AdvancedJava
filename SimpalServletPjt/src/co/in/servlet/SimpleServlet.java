package co.in.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServlet" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SavedeUserName = null;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// Set response content type
		      response.setContentType("text/html");

		      PrintWriter write = response.getWriter();
		      String userName =request.getParameter("name");
		      HttpSession session = request.getSession();
		      if (userName != "" && userName != null) {
		    	  session.setAttribute("SavedUserName", userName);
				
			}
		      session.setAttribute("SavedeUserName", userName);
		      write.println("requset parameter has username as " + userName);
		      write.println("Session parameter has username as  " + session.getAttribute(SavedeUserName));
		      
		      
	}

}
