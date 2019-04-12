package com.wzn.fastJson;

import com.alibaba.fastjson.annotation.JSONField;

public class User {
	@JSONField(ordinal=1)
	private String username;
	@JSONField(ordinal=2)
	private int age;
	@JSONField(serialize=false)
	private String sex;
	@JSONField(ordinal=3)
	private Money money;

	public User(String username, int age, String sex, Money money) {
		super();
		this.username = username;
		this.age = age;
		this.sex = sex;
		this.money = money;
	}

	public User(String username, int age, String sex) {
		super();
		this.username = username;
		this.age = age;
		this.sex = sex;
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + ", sex=" + sex + ", money=" + money + "]";
	}


}
