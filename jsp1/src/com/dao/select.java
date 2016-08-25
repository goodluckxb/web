package com.dao;

import org.apache.ibatis.annotations.Select;

public interface select {
	@Select("select 1")
	public Integer select1();
}
