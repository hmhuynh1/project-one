package controller;

import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.catBreeds;


/**
 * Servlet implementation class ShowCat
 */

@WebServlet("/showCat")
public class showCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showCat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CatHelper helper = new CatHelper();
		
		List<catBreeds> treeList = helper.showAllCatBreed();

		request.setAttribute("allCats", treeList);
		
		String path = "/Show.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
