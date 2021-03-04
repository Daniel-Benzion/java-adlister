import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;


@WebServlet(name = "WhatNumberServlet", urlPatterns = "/what-num")
public class WhatNumberServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String userNum = request.getParameter("num");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		if (userNum != null) {
			out.println("User number was: " + userNum);
		} else {
			out.println("You're no fun...");
		}

	}

}
