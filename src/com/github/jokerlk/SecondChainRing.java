package com.github.jokerlk;

public class SecondChainRing extends ChainRing {

	@Override
	public boolean canHandle(MyRequest ring) {
		if(ring.getDiscriminator() <= 10){
			return true;			
		}
		
		System.out.println("Second Chain CANNOT handle");
		return false;
	}

	@Override
	public void doHandle(MyRequest ring) {

		System.out.println("SecondChain " + ring.getText());

	}

}
