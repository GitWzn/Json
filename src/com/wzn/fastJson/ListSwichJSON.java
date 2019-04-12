package com.wzn.fastJson;

import java.util.ArrayList;

import com.alibaba.fastjson.JSON;

public class ListSwichJSON {
	public static void main(String[] args) {
		// 创建list集合
		ArrayList<User> users = new ArrayList<>();
		// 创建User对象,将对象放入集合中
		users.add(new User("吴宗宁", 18, "男"));
		users.add(new User("gggg", 45, "女"));
		users.add(new User("是是是", 32, "男"));
		String jsonString = JSON.toJSONString(users);
		System.out.println(jsonString);
	}
}
