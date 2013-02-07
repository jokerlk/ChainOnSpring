package com.github.jokerlk;

public abstract class ChainRing {

	protected ChainRing next;
	
	protected void setNext(ChainRing ring){
		this.next = ring;
	}
	
	public final void handleRequest(MyRequest ring){
		if(this.canHandle(ring)){
			this.doHandle(ring);
		} else {
			if(next != null){
				next.handleRequest(ring);
			}
		}
	}
	
	protected abstract boolean canHandle(MyRequest ring);
	
	protected abstract void doHandle(MyRequest ring);
}
