package com.wzn.fastJson;

import java.util.HashMap;

import com.alibaba.fastjson.JSON;

public class MapSwichJSON {
	public static void main(String[] args) {
		//创建HashMap
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("column", "username");
		map.put("key", 123);
		map.put("age", 56);
		//将HashMap转换成JSON字符串
		String jsonString = JSON.toJSONString(map);
		System.out.println(jsonString);
	}
}
