package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardSample
 */
@WebServlet("/ForwardSampleServlet")
public class ForwardSampleServlet extends HttpServlet {

private static final long serialVersionUID=1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fortune="大吉";
		request.setAttribute("ft",fortune);
		int comfortIndex=85;
		request.setAttribute("ci",comfortIndex);
		String weather="晴れ";
		request.setAttribute("ft",weather);
		RequestDispatcher
		rd=request.getRequestDispatcher("/WEB-INF/jsp/forwardSample.jsp");
rd.forward(request,response);
	}

}
