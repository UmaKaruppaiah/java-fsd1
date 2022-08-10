

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("txtuname");
		String password=request.getParameter("txtpassword");
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		if(uname.equals("user")&& password.equals("user@123"))
			out.println("Welcome");
		else
			out.println("Invalid user or password");
		
		
	}

	
}
