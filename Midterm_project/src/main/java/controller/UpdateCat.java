package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CatBreed;


/**
 * Servlet implementation class UpdateCat
 */
@WebServlet("/UpdateCat")
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
		
		String catBreedName = request.getParameter("catBreedName");
		String factsAboutCat = request.getParameter("factsAboutCat");
		Double catSize = Double.valueOf(request.getParameter("catSize"));

		CatBreed catToUpdate = helper.searchCatByBreed(catBreedName);
		catToUpdate.setBreeds(catBreedName);
		catToUpdate.setFactsAboutCats(factsAboutCat);
		catToUpdate.setSize(catSize);
		helper.update(catToUpdate);
	}
}