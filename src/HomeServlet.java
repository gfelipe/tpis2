import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        BootStrap bootStrap = new BootStrap();
        bootStrap.createTables();
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



    }

    private void incrementSessionCounters(HttpServletRequest request) {
        Integer userTimesUsed = (Integer) request.getSession().getAttribute("timesUsed");
        Integer timesUsed = (Integer) request.getSession().getServletContext().getAttribute("timesUsed");

        userTimesUsed = userTimesUsed == null ? 1 : userTimesUsed + 1;
        timesUsed = timesUsed == null ? 1 : timesUsed + 1;

        request.getSession().setAttribute("timesUsed", userTimesUsed);
        request.getSession().getServletContext().setAttribute("timesUsed", timesUsed);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
