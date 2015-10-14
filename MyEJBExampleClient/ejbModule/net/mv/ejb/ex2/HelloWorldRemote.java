package net.mv.ejb.ex2;

import javax.ejb.Remote;

@Remote
public interface HelloWorldRemote {

	public String sayHello(String name);
}
