package net.mv.receiptService;

import java.util.Set;

import javax.ejb.Remote;

import net.mv.ejb.pojos.Item;
import net.mv.model.Receipt;
import net.mv.pojos.Customer;

@Remote
public interface ReceiptServiceRemote {

	public Receipt createReceipt(Customer customer, Set<Item> items);
	public void saveReceipt(Receipt receipt);
}
