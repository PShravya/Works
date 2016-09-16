package com.fii.displaycustomer.service;

import com.fii.displaycustomer.dao.MessageServiceDAO;

public class MessageService {

	
	public int setCustomerService(int c_id, int serv_id) {
	
		MessageServiceDAO messageServiceDao = new MessageServiceDAO();
		int rowUpdate = messageServiceDao.saveCustomerService(c_id, serv_id);
		return rowUpdate;
	}
}
