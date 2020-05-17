package com.bw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.bean.House;

public interface HouseMapper {
	List<House> list(@Param(value = "areaName") String areaName);

	int add(House house);

	House getById(Integer id);

	int update(House house);

	int deleteById(Integer id);
}
