package com.github.jokerlk;

import java.util.Random;

public class MyRequest {
	
	private String text = "MyRequest test";
	
	private int discriminator = (new Random()).nextInt(20);

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(int discriminator) {
		this.discriminator = discriminator;
	}
	

}
