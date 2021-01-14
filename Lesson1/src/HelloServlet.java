

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		String[] luckArray= {"超スッキリ!","スッキリ!","最悪!"};
		int index=(int)(Math.random()*3);
				String luck=luckArray[index];

		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM月dd日");
		String today=sdf.format(date);

		//HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>スッキリ占い</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+today+"の運勢は「"+luck+"」です</p>");
		out.println("</body>");
		out.println("</html>");
	}
}