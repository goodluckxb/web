package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entry.DepartMent;
import com.entry.FixedIncome;
import com.entry.User;

public interface select {
	
	@Select("select * from TAIJS_USER_INFO limit 1,10")
	public List<FixedIncome> selectfix();
	
	@Select("select * from num1 ")
	public List<User> queryUserInfo();
	
	@Update("update num1 set PHONE=15042575576 where PHONE=15042575577")
	public int updateNum1();
}

