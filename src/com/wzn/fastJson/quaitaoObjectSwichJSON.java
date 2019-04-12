package com.wzn.fastJson;

import com.alibaba.fastjson.JSON;

public class quaitaoObjectSwichJSON {
	public static void main(String[] args) {
		User uer = new User("吴宗宁", 18, "男",new Money(9999, 888));
		//将嵌套式对象转换成JSON字符串
		String jsonString = JSON.toJSONString(uer);
		System.out.println(jsonString);
	}
}
