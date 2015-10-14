package net.mv.receiptService;

import java.util.Set;

import javax.ejb.Stateless;

import net.mv.ejb.pojos.Item;
import net.mv.hibernateUtil.HibernateUtil;
import net.mv.model.Receipt;
import net.mv.pojos.Customer;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Session Bean implementation class ReceiptService
 */
@Stateless(mappedName = "ourEJBReceipt")
public class ReceiptService implements ReceiptServiceRemote {

    /**
     * Default constructor. 
     */
    public ReceiptService() {
    }

    @Override
	public Receipt createReceipt(Customer customer, Set<Item> items) {
		Receipt receipt = new Receipt();
		receipt.setCustomer(customer);
		receipt.setItems(items);
		
		return receipt;
	}

	@Override
	public void saveReceipt(Receipt receipt) {
		//Open Session
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
				
		session.save(receipt);
				
		tx.commit();
		session.close();
		
	}

	
}