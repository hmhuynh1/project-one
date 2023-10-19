package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.OwnerAddress;

/**
 * Servlet implementation class showAddress
 */
@WebServlet("/showAddress")
public class showAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showAddress() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AddressHelper helper = new AddressHelper();
		
		List<OwnerAddress> addressList = helper.showAllAddress();

		request.setAttribute("alLAddress", addressList );
		
		String path = "/Show2.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}


}
