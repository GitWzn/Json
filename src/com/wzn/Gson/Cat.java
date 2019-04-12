package com.wzn.Gson;

public class Cat {
	private String color;

	public Cat(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "cat [color=" + color + "]";
	}
}
