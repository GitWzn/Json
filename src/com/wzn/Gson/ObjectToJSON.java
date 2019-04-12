package com.wzn.Gson;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectToJSON {
	public static void main(String[] args) {
		//创建Gson对象
		GsonBuilder gsonBuilder = new GsonBuilder();
		//当属性为空值时显示null
		gsonBuilder.serializeNulls();
		//设置时间的格式
		gsonBuilder.setDateFormat("yyy-MM-dd HH:mm:ss:SSS");
		//通过gsonBuilder虎丘gson
		Gson gson = gsonBuilder.create();
		Cat cat = new Cat("红红的");
		String jsonStr = gson.toJson(new Animal(null, 10, new Date(), cat));
		System.out.println(jsonStr);
	}
}
