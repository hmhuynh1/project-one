package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.catBreeds;

/**
 * Servlet implementation class AddCatBreed
 */
@WebServlet("/addCatBreed")
public class AddCatBreed extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCatBreed() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		catBreeds b = new catBreeds();
		CatHelper helper = new CatHelper();
		b.setBreeds(request.getParameter("breeds"));
		b.setFactsAboutCats(request.getParameter("factsAboutCats"));
		b.setCatSize(Double.valueOf(request.getParameter("catSize")));
		helper.persist(b);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
