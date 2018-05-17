package com.yonyou.test;

import com.yonyou.entity.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestLombok {
	
	public static void main(String[] args) {
		User u = new User();
		u.setUserName("admin");
		System.out.println(u.getUserName());
		log.info(u.getUserName());
	}

}
