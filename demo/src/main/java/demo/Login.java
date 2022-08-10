package demo;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Login")
public class Login extends HttpServlet{
private static final long serialVersionUID = 1L;

    
    public Login(){
        // TODO Auto-generated constructor stub
    	super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Get the print writer object to write into the response
				PrintWriter out = response.getWriter();

				// Set the content type of response to "text/html"
				response.setContentType("text/html");

				// For understanding purpose, print the session object in the console before
				// invalidating the session.
				System.out.println("Session before invalidate: "+ request.getSession(false));

				// Invalidate the session.
				request.getSession(false).invalidate();

				// Print the session object in the console after invalidating the session.
				System.out.println("Session after invalidate: "+ request.getSession(false));

				// Print success message to the user and close the print writer object.
				out.println("Thank you! You are successfully logged out.");
				out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Set the content type of response to "text/html"
				response.setContentType("text/html");

				// Get the print writer object to write into the response
				PrintWriter out = response.getWriter();

				// Get the session object
				HttpSession session = request.getSession();

				// Get User entered details from the request using request parameter.
				String user = request.getParameter("usName");
				String password = request.getParameter("usPass");

				// Validate the password - If password is correct,
				// set the user in this session
				// and redirect to welcome page
				if (password.equals("Abc@123")) {
					session.setAttribute("Jainisha", user);
					response.sendRedirect("welcome.html?name=" + user);
				}
				// If the password is wrong, display the error message on the login page.
				else {
					RequestDispatcher rd = request.getRequestDispatcher("login.html");
					out.println("<font color=red>Password is wrong.</font>");
					rd.include(request, response);
				}
				// Close the print writer object.
				out.close();//doGet(request, response);
	}


}
