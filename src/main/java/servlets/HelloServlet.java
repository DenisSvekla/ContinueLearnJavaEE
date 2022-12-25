package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String smth = req.getParameter("cat");
        System.out.println(smth);
     getServletContext().getRequestDispatcher("/HtmlWithCsswithdifferentFile.html").forward(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("destroy hello destory");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init hello init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("service done");
    }
}
