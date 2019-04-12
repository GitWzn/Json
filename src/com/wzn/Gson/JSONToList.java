package com.wzn.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JSONToList {
	public static void main(String[] args) {
		String jsonStr = "[{'name':'狗','age':10,'time':'Jan 14, 2019 7:37:02 PM','cat':{'color':'红红的'}},{'name':'狗','age':11,'time':'Jan 14, 2019 7:37:02 PM','cat':{'color':'红红的'}},{'name':'狗','age':12,'time':'Jan 14, 2019 7:37:02 PM','cat':{'color':'红红的'}},{'name':'狗','age':13,'time':'Jan 14, 2019 7:37:02 PM','cat':{'color':'红红的'}},{'name':'狗','age':14,'time':'Jan 14, 2019 7:37:02 PM','cat':{'color':'红红的'}}]";
		//使用Gson将多个JSON字符串转换成List集合
		Type type = new TypeToken<ArrayList<Animal>>(){}.getType();
		ArrayList<Animal> animals = new Gson().fromJson(jsonStr, type);
		//遍历集合
		for (Animal animal : animals) {
			System.out.println(animal.getCat().getColor());
		}
	}
}
