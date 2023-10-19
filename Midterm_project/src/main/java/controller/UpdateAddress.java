package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.OwnerAddress;



/**
 * Servlet implementation class UpdateCat
 */
@WebServlet("/updateAddress")
public class UpdateAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAddress() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param CatToUpdate 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AddressHelper helper = new AddressHelper();
		
		String oldName = request.getParameter("oldName");
		String catName = request.getParameter("catName");
		String ownerAddress = request.getParameter("ownerAddress");
		Double ownerPhoneNumber = Double.valueOf(request.getParameter("ownerPhoneNumber"));

		OwnerAddress addressToUpdate = helper.searchAddress(oldName);
		addressToUpdate.setCatName(catName);
		addressToUpdate.setOwnerAddress(ownerAddress);
		addressToUpdate.setOwnerPhoneNumber(ownerPhoneNumber);
		helper.update(addressToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}
}