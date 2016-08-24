package com.bean;

import org.springframework.stereotype.Service;

@Service
public class MatchService {

	public void method1() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+",");
		}
	}
}
