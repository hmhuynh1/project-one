package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StringStatistics;

/**
 * Servlet implementation class GetReverseText
 */
@WebServlet("/getReverseText")
public class getReverseText extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getReverseText() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userText = request.getParameter("userText");
		String outText = "";
		for (int i = userText.length(); i > 0; i--) {
			outText = outText + userText.charAt(i-1);
		}
		StringStatistics stats = new StringStatistics(userText);
		stats.setReversed(outText);
		request.setAttribute("stats", stats);
		getServletContext().getRequestDispatcher("/response.jsp").forward(request, response);
	}
}
