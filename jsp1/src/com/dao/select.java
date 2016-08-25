package com.dao;

import org.apache.ibatis.annotations.Select;

import com.entry.FixedIncome;

public interface select {
	@Select("select 1")
	public Integer select1();
	
	@Select("select * from TAIJS_FIXED_INCOME where id=1")
	public FixedIncome selectfix();
}
