package com.github.jokerlk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MyRequest request = new MyRequest();
		System.out.println("Request discriminator " + request.getDiscriminator() + "\n");
		
		System.out.println("--- Straight Chain ---");
		MyRequestChainBuilder straightBuilder = (MyRequestChainBuilder) ctx.getBean("straightChainBuilder");
		straightBuilder.getChain().handleRequest(request);

		System.out.println("--- Inverse Chain ---");
		MyRequestChainBuilder inverseBuilder = (MyRequestChainBuilder) ctx.getBean("inverseChainBuilder");
		inverseBuilder.getChain().handleRequest(request);
	}

}
