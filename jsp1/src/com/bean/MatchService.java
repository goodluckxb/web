package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.select;
import com.entry.FixedIncome;

@Service
public class MatchService {
	@Autowired
	private select select;

	public void method1() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+",");
		}
	}
	
	public void method2() {
		System.out.println(select.select1());
	}
	
	public void method3() {
		FixedIncome fixedIncome=select.selectfix();
		System.out.println(fixedIncome.getName());
	}
}
