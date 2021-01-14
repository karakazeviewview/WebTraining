package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic;
import model.User;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//フォワード先
		String forwardPath=null;

		//サーブレットクラスの動作を決定する「」の値を
		//リクエストパラメータから取得
		String action=request.getParameter("action");

		//「」をリクエストされたときの処理
		if(action==null) {
			//フォワード先を設定
			forwardPath="/WEB-INF/jsp/registerForm.jsp";
		}

		//登録確認画面から「」をリクエストされたときの処理
		else if(action.equals("done")) {
			//セッションスコープに保存された登録ユーザを取得
			HttpSession session=request.getSession();
			User registerUser=(User) session.getAttribute("registerUser");

			//仮登録の呼び出し
			RegisterUserLogic logic=new RegisterUserLogic();
			logic.execute(registerUser);

			//不要となったセッションスコープ内のインスタンスを削除
			session.removeAttribute("registerUser");

			//登録後のフォワード先を設定
			forwardPath="/WEB-INF/jsp/registerDone.jsp";

		}

		//設定されたフォワード先にフォワード
		RequestDispatcher dispatcher=request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
		}





	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");

		//登録するユーザの情報を設定
		User registerUser=new User(id,name,pass);

		//セッションスコープに登録ユーザを保存
		HttpSession session=request.getSession();
		session.setAttribute("registerUser",registerUser);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/registerConfirm.jsp");
		dispatcher.forward(request, response);
	}

}
