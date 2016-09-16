package com.fii.displaycustomer.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.fii.displaycustomer.dao.CustomerDAO;
import com.fii.displaycustomer.model.ServicePlan;


@WebService
public class CustomerSoapService {

	@WebMethod
	public List<ServicePlan> getServicePlan() {
		List<ServicePlan> servicePlan = CustomerDAO.getServicePlan();
		return servicePlan;
	}
}
