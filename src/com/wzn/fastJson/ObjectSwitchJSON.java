package com.wzn.fastJson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class ObjectSwitchJSON {
	public static void main(String[] args) {
//		User user = new User("吴宗宁", 18, "男");
		User user = new User("吴宗宁", 18, null);
		System.out.println(user);
		System.out.println();
		//将java对象转换成JSON字符串
		String jsonString = JSON.toJSONString(user);
		System.out.println(jsonString);
		System.out.println();
		//在给属性值null时   不给响应的序列化对象是不会显示得   所以我们应该给上相应的序列化对象
		String jsonString2 = JSON.toJSONString(user, SerializerFeature.WriteMapNullValue);
		System.out.println(jsonString2);
	}
}
