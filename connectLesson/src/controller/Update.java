package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonDAO2;
import model.Person;

@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s_id=request.getParameter("id");
		if(s_id == null){
			response.sendRedirect("/connectLesson/Read");
		}else{
			PersonDAO2 dao=new PersonDAO2();
			Person person=dao.findOne(Integer.parseInt(s_id));
			request.setAttribute("person", person);
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/update.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//以下を追記
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String id=request.getParameter("id");
		Person person=new Person(Integer.parseInt(id),name,Integer.parseInt(age));
		PersonDAO2 dao=new PersonDAO2();
		dao.updateOne(person);

		response.sendRedirect("/connectLesson/Read");
	}

}
