package co.in.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XmlServlet
 */
@WebServlet("/XmlServlet")
public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println("Hello from GET mathod!" + userName);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		out.println("Hello from POST method!" + userName + "!we know your full name is" + fullName);
		String prof = request.getParameter("prof");
		out.println("You are a " + prof);

		// String location = request.getParameter("location");
		String[] location = request.getParameterValues("location");
		out.println("You are at " + location.length + "places");
		for (int i = 0; i < location.length; i++) {
			out.println(location[i]);

		}

	}

}
