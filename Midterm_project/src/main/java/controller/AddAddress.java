package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.OwnerAddress;


/**
 * Servlet implementation class AddAddress
 */
@WebServlet("/addAddress")
public class AddAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAddress() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OwnerAddress t = new OwnerAddress();
		AddressHelper helper = new AddressHelper();
		t.setCatName(request.getParameter("catName"));
		t.setOwnerAddress(request.getParameter("ownerAddress"));
		t.setOwnerPhoneNumber(Double.valueOf(request.getParameter("ownerPhoneNumber")));
		helper.persist(t);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
