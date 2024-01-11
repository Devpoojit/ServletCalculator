package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("first-num");
        String num2 = request.getParameter("second-num");
        String operator = request.getParameter("bt");

        // Check if the parameters are not null and not empty
        if (num1 != null && !num1.isEmpty() && num2 != null && !num2.isEmpty()) {
            try {
                int i = Integer.parseInt(num1);
                int j = Integer.parseInt(num2);
                int res = 0;
                switch(operator) {
                case "1":
                	res = i + j;
                	break;
                case "2":
                	res = i - j;
                	break;
                case "3":
                	res = i * j;
                	break;
                case "4":
                	res = i / j;
                	break;
                default:
                	response.getWriter().append("Invalid input. Please ensure both parameters are integers.");
                }
                response.getWriter().append("Result is: " + res);
            } catch (NumberFormatException e) {
                response.getWriter().append("Invalid input. Please ensure both parameters are integers.");
            }
        } else {
            response.getWriter().append("Missing parameters. Please provide both 'first-num' and 'second-num'.");
        }
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
