import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

    int counter = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String reset = request.getParameter("reset");

        if (reset != null) {
            counter = 0;
        }
        counter++;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        if (name != null) {
            out.printf("<h1> Hello, %s!</h1>", name);
        } else {
            out.println("<h1>Hello, World!</h1>");
        }

        out.printf("<p>Total page views: %d</p>", counter);
    }
}
