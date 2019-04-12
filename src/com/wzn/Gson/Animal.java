package com.wzn.Gson;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Animal {
	@SerializedName(value = "AnimalName",alternate={"A_name","Aname"})
	private String name;
	private int age;
	private Date time;
	private Cat cat;

	public Animal(String name, int age, Date time, Cat cat) {
		super();
		this.name = name;
		this.age = age;
		this.time = time;
		this.cat = cat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", time=" + time + ", cat=" + cat + "]";
	}
}
