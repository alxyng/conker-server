package co.conker.servlet;

import co.conker.Database;
import co.conker.entity.User;
import co.conker.request.LoginRequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		
		PrintWriter out = response.getWriter();
		
		LoginRequest loginRequest = new LoginRequest(request);
		
		if (loginRequest.isValid()) {
			// Associate user with session?
		}
			
		out.println(loginRequest.getJSONResponse());
		
		//response.getWriter().println("session=" + request.getSession(true).getId());
	}
}

