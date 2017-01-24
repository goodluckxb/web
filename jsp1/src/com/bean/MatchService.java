package com.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.select;
import com.entry.DepartMent;
import com.entry.FixedIncome;
import com.entry.User;

@Service
public class MatchService {
	@Autowired
	private select select;

	public List<FixedIncome> method3() {
		List<FixedIncome> fixedIncomes=select.selectfix();
		return fixedIncomes;
	}
	
	public List<User> method1() {
		return select.queryUserInfo();
	}
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public int updatePhone() {
		return select.updateNum1();
	}
}
