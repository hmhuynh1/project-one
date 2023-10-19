package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.catBreeds;

/**
 * Servlet implementation class DeleteCatBreed
 */
@WebServlet("/deleteCatBreed")
public class DeleteCatBreed extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCatBreed() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			CatHelper helper = new CatHelper ();
			String name = request.getParameter("name");
			catBreeds deleteable = helper.searchCatByBreed(name);
			helper.delete(deleteable);
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

