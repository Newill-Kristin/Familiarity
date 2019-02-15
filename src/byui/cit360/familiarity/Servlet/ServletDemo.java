package byui.cit360.familiarity.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kristin Newill (aingealfire) on 2/14/2019.
 */
@WebServlet(name = "ServletDemo", urlPatterns = {"/ServletDemo"})
public class ServletDemo extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter post = response.getWriter();
        response.setContentType("text/html");

        post.println("<html><head></head><body>");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String add1 = request.getParameter("add1");
            String add2 = request.getParameter("add2");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");
            String tele = request.getParameter("tele");
        post.println("<h1>You Entered Contact Info For:</h1>");
        post.println("<p>\n" +
                "First Name: " + firstName + " Last Name:" + lastName + "\n" +
                "Address: " + add1 + "\n" +
                "         " + add2 + "\n" +
                "         " + city + ", " + state + " " + zip + "\n" +
                "Telephone: " + tele + "\n" +
                "</p>");
        post.println("</body></html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("This is not available right now.");

    }

}
