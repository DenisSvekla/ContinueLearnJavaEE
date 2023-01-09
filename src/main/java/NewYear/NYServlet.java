package NewYear;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/NewYear")
public class NYServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, User> check = new HashMap<>();
        check.put("1",new User("Edik", "10000$"));
        check.put("2",new User("Denis", "8000$"));
        check.put("3",new User("Lera", "5000$"));
        User user = check.get(req.getParameter("id"));
        req.setAttribute("name",user);
       getServletContext().getRequestDispatcher("/Ny.jsp").forward(req,resp);
    }
}
