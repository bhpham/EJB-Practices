package net.mv.ejb.ex2;

import javax.ejb.Remote;

@Remote
public interface StatefulHelloWorldRemote {

	public String sayHello(String name);
}
