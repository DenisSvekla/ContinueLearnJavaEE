package filters;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import java.io.IOException;

@WebFilter("/hello")

public class HelloFilter1 extends HttpFilter {



    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("nice i filter second");
        chain.doFilter(req, res);

    }
}
