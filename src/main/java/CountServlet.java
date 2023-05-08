import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/count")
public class CountServlet extends HttpServlet {

    private int hitCount;

    public void init() {
        hitCount = 0;
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reset = req.getParameter("Y");
        resp.setContentType("text/html");
        hitCount++;
        PrintWriter out = resp.getWriter();

        if(req.getParameter("reset") !=null) {
            hitCount = 0;
        }

        String title = "Total Number of Hits";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                    "<head><title>" + title + "</title></head>\n" +
                    "<body bgcolor = \"#f0f0f0\">\n" +
                        "<h1 align = \"center\">" + title + "</h1>\n" +
                        "<h2 align = \"center\">" + hitCount + "</h2>\n" +
                    "</body>" +
                "</html>");
    };
}
