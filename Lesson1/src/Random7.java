

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Random7
 */
@WebServlet("/Random7")
public class Random7 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		final int LUCKY=777;
		int no;
		int count=0;
		do{
			count++;
			no=new java.util.Random().nextInt(1000);
		}while(no != LUCKY);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>777ゲーム</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+no+"</p>");
		out.println("<p>"+count+"回目に"+LUCKY+"が出ました");
		out.println("</body>");
		out.println("</html>");
	}
}
