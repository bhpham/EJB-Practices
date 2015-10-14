package net.mv.ejb.ex2;

import javax.ejb.Stateful;

/**
 * Session Bean implementation class StatefulHelloWorld
 */
@Stateful(mappedName = "myStatefulEJB")
public class StatefulHelloWorld implements StatefulHelloWorldRemote {

	private long counter;
	
    /**
     * Default constructor. 
     */
    public StatefulHelloWorld() {
    }

	@Override
	public String sayHello(String name) {
		return "Hello "+ name + " you have called " + ++counter + " times.";
	}

}
