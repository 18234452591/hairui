package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.House;
import com.bw.mapper.HouseMapper;
import com.bw.service.HouseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class HouseServiceImpl implements HouseService {

	@Autowired
	private HouseMapper houseMapper;

	@Override
	public PageInfo<House> list(int pageNo, int pageSize, String areaName) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNo, pageSize);
		List<House> list = houseMapper.list(areaName);
		return new PageInfo<House>(list);
	}

	@Override
	public int add(House house) {
		// TODO Auto-generated method stub
		return houseMapper.add(house);
	}

	@Override
	public House getById(Integer id) {
		// TODO Auto-generated method stub
		return houseMapper.getById(id);
	}

	@Override
	public int update(House house) {
		// TODO Auto-generated method stub
		return houseMapper.update(house);
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return houseMapper.deleteById(id);
	}

}
