package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.catBreeds;


/**
 * Servlet implementation class UpdateCat
 */
@WebServlet("/updateCat")
public class UpdateCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param CatToUpdate 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CatHelper helper = new CatHelper();
		
		String oldName = request.getParameter("oldName");
		String breeds = request.getParameter("breeds");
		String factsAboutCat = request.getParameter("factsAboutCats");
		Double catSize = Double.valueOf(request.getParameter("catSize"));

		catBreeds catToUpdate = helper.searchCatByBreed(oldName);
		catToUpdate.setBreeds(breeds);
		catToUpdate.setFactsAboutCats(factsAboutCat);
		catToUpdate.setCatSize(catSize);
		helper.update(catToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}
}