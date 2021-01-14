package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet")
public class servlet3 extends HttpServlet {
    private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタ.
	 */
    public servlet3() {
        super();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);

        System.out.println("GETメソッドで呼び出されました");

		String text1 = "";	// テキスト1格納用変数
		String text2 = "";	// テキスト2格納用変数

		// JSPの画面から値を取得
        /*
        指定のnameから値取得
        */
		text1 = request.getParameter("text1");
		text2 = request.getParameter("text2");

		// 取得した値をコンソールに出力
		System.out.println(text1);
		System.out.println(text2);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);

        System.out.println("POSTメソッドで呼び出されました");

		String text1 = "";	// テキスト1格納用変数
		String text2 = "";	// テキスト2格納用変数

		// JSPの画面から値を取得
		text1 = request.getParameter("text1");
		text2 = request.getParameter("text2");

		// 取得した値をコンソールに出力
		System.out.println(text1);
		System.out.println(text2);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}