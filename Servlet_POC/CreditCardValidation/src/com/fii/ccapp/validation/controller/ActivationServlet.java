package com.fii.ccapp.validation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fii.ccapp.validation.model.CreditCard;
import com.fii.ccapp.validation.model.Customer;
import com.fii.ccapp.validation.service.ActivationService;

/**
 * @author Shravya Peddiraju
 */
@WebServlet("/ActivationHandler")
public class ActivationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ActivationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		String cardNumber = request.getParameter("ccNumber");
		String cardName = request.getParameter("ccName");
		String ssn = request.getParameter("ssn");
		String cvv = request.getParameter("cvv");

		CreditCard c = new CreditCard();

		c.setNameOnCard(cardName);
		c.setcardNumber(cardNumber);
		c.setSsn(ssn);
		c.setCvv(cvv);

		Customer result = ActivationService.validateCreditCardInfo(c);

		try {

			if (cardNumber.equals(result.getCard().getcardNumber())) {
				out.println("<html><body>");
				out.println("<p>Credit Card activated successfully</p>");
				out.println("First Name : \n" + result.getFname() + "<br>" + "Last Name : \n" + result.getlname()
						+ "<br>" + "Email ID: \n" + result.getEmail() + "<br>" + "Contact Details \n"
						+ result.getContact() + result.getCard().getcardNumber());
				out.println("</body></html>");
			}

		} catch (NullPointerException e) {
			out.print("Not Successfull");
		}
	}
}
