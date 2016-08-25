package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.entry.FixedIncome;

public interface select {
	
	@Select("select * from TAIJS_FIXED_INCOME limit 1,10")
	public List<FixedIncome> selectfix();
}
