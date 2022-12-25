package listeners;


import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class StartListeners implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

        System.out.println(sre.getServletContext());
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println(sre.getServletContext());
    }
}
