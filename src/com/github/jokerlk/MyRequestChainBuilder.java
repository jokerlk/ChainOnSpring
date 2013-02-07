package com.github.jokerlk;

import java.util.Iterator;
import java.util.List;

public class MyRequestChainBuilder {
	
	private ChainRing head;
	
	public MyRequestChainBuilder(List<ChainRing> processor){
		if(processor != null && processor.size() > 0){
			Iterator<ChainRing> it = processor.iterator();
			head = it.next();
			ChainRing prev = head;
			while(it.hasNext()){
				ChainRing next = it.next();
				prev.setNext(next);
				prev = next;
			}
		} else {
			throw new IllegalArgumentException("Null or void parameter!!!");
		}
	}
	
	public ChainRing getChain(){
		return head;
	}

}
