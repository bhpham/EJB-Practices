package net.mv.ejb.ex2;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Message-Driven Bean implementation class for: MyTopic
 */
@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "jms/topic"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Topic")
		}, 
		mappedName = "jms/topic")
public class MyTopic implements MessageListener {

    /**
     * Default constructor. 
     */
    public MyTopic() {
        // TODO Auto-generated constructor stub
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
    	if (message instanceof TextMessage) {
    		TextMessage tm =  (TextMessage) message;
    		try {
				System.out.println(tm.getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}
    	}
    }

}
