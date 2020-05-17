package com.bw.service;

import com.bw.bean.House;
import com.github.pagehelper.PageInfo;

public interface HouseService {
	PageInfo<House> list(int pageNo, int pageSize, String areaName);

	int add(House house);

	House getById(Integer id);

	int update(House house);

	int deleteById(Integer id);
}
