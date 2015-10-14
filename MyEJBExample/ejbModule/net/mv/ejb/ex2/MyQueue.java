package net.mv.ejb.ex2;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Message-Driven Bean implementation class for: MyQueue
 */
@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "jms/queue"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Queue")
		}, 
		mappedName = "jms/queue")
public class MyQueue implements MessageListener {

    /**
     * Default constructor. 
     */
    public MyQueue() {
        // TODO Auto-generated constructor stub
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
    	
    	if (message instanceof TextMessage) {
    		TextMessage tm = (TextMessage) message;
    		
    		try {
				System.out.println(tm.getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}
    	
    	}
        
    }

}
