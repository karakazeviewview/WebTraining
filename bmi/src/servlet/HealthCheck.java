package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

import model.Health;
import model.HealthCheckLogic;
/**
 * Servlet implementation class HealthCheck
 */
@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void deGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException{
		//フォワード
		RequestDispatcher dispatcher=request.getRequestDispatcher	("/WEB-INF/jsp/HealthCheck.jsp");
		dispatcher.forward(request,response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		//リクエストパラメータを取得
		String health=new Health();
		health.setHeight(Double.parseDouble(height));
		health.setWeight(Double.parseDouble(weight));

		//健康診断を実行し結果を設定
		HealthCheckLogic healthCheckLogic=new HealthCheckLogic();
		healthCheckLogic.excute(health);

		//リクエストスコープに保存
		request.setAttribute("health",health);

		//フォワード
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/healthCheckRequest.jsp");
		dispatcher.forward(request, response);
	}
	}
