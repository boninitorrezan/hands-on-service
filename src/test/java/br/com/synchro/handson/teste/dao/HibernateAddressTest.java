package br.com.synchro.handson.teste.dao;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.After;
import org.junit.Test;

import br.com.synchro.handson.domain.Address;
import br.com.synchro.handson.teste.util.HibernateUtil;

public class HibernateAddressTest {
	
	/**
     * 
     */
    //@After
    public void tearDown() {
	   final Session session = HibernateUtil.getSessionFactory().openSession();
	   session.beginTransaction();
	   final Address address = (Address) session.createCriteria(Address.class)
		   .add(Restrictions.eq("street", "Rua arizona")).uniqueResult();
	   session.delete(address);
	   session.getTransaction().commit();
    }
	
	/**
	 * Teste
	 */
	@Test
	public void testeHibernateCfgAndPersist() {
		final Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			session.beginTransaction();
			
			final Address address = new Address();
			address.setStreet("Rua arizona");
			address.setNumber(50033);
			address.setCity("SP");
			address.setDistrict("SP");
			address.setZipcode("13607-440");
			
			session.persist(address);
			
			session.getTransaction().commit();
			
		} catch(final Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
	}

}
