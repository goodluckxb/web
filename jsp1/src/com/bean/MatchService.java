package com.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.select;
import com.entry.DepartMent;
import com.entry.FixedIncome;

@Service
public class MatchService {
	@Autowired
	private select select;

	public List<FixedIncome> method3() {
		List<FixedIncome> fixedIncomes=select.selectfix();
		return fixedIncomes;
	}
	
	public DepartMent method1() {
		return select.findDepartment();
	}
}
