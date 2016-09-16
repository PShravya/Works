package com.fii.ccapp.validation.service;

import com.fii.ccapp.validation.dao.ActivationDao;
import com.fii.ccapp.validation.model.CreditCard;
import com.fii.ccapp.validation.model.Customer;

/**
 * @author Shravya Peddiraju
 */
public class ActivationService {

	public static Customer validateCreditCardInfo(CreditCard cc) {

		Customer cust = ActivationDao.validateDetails(cc);

		return cust;
	}
}
