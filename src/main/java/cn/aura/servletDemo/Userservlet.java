package cn.aura.servletDemo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Userservlet
 */
@WebServlet("/user")
public class Userservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello接收到请求");
		PrintWriter writer = response.getWriter();
		writer.println("success");
		writer.close();
	}

}
