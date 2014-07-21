import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginController extends HttpServlet {
 public LoginController(){
	 System.out.println("Default constructor");
 }
 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String userName = req.getParameter("userName");
		String pwd = req.getParameter("password");
		PrintWriter out = resp.getWriter();
		out.println("UserName == "+userName);
		out.println("<br/>Password == "+pwd);
	}
}
