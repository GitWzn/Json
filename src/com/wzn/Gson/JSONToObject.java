package com.wzn.Gson;

import com.google.gson.Gson;

public class JSONToObject {
	public static void main(String[] args) {
		String jsonStr = "{'Aname':'狗','age':10,'time':'Jan 14, 2019 7:37:02 PM','cat':{'color':'红红的'}}";
		//使用Gson将JSON字符串转换成对象
		Gson gson = new Gson();
		Animal fromJson = gson.fromJson(jsonStr, Animal.class);
		System.out.println(fromJson);
		System.out.println(fromJson.getCat().getColor());
	}
}



