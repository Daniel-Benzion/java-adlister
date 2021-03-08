import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("order-form.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		if (request.getMethod().equals("POST")) {
			String crust = request.getParameter("crust");

			String sauce = request.getParameter("sauce");

			String size = request.getParameter("size");

			String[] toppings = request.getParameterValues("toppings");

			System.out.println("Crust: " + crust);
			System.out.println("Sauce: " + sauce);
			System.out.println("Size: " + size);
			System.out.println("Toppings: ");
			for (String topping : toppings) {
				System.out.println(topping);
			}
		}
		request.getRequestDispatcher("order-form.jsp").forward(request, response);
	}


}
