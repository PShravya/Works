package com.fii.utilityservice.registration.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fii.utilityservice.registration.model.Customer;
import com.fii.utilityservice.registration.util.HibernateUtil;


/**
 * @author Shravya Peddiraju
 */
public class RegistrationDao {

	public int insertCustomer(Customer customer) {
		int cust_id = 0;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Transaction trans = session.beginTransaction();
			cust_id = (Integer) session.save(customer);
			trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.close();
		return cust_id;
	}
}