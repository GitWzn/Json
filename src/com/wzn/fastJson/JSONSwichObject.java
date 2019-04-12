package com.wzn.fastJson;

import com.alibaba.fastjson.JSON;

public class JSONSwichObject {
	public static void main(String[] args) {
		String user = "{'age':18,'money':{'RMB11':19999,'US':1888},'sex':'男','username':'吴宗宁'}";
		//将JSON字符串转换成指定的对象
		User userObj = JSON.parseObject(user, User.class);
		System.out.println(userObj);
		System.out.println(userObj.getUsername());
//		System.out.println(userObj.getMoney().getRMB1());
	}
}
