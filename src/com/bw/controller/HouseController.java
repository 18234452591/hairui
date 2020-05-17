package com.bw.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.House;
import com.bw.service.HouseService;
import com.bw.utils.PageUtils;
import com.github.pagehelper.PageInfo;

@Controller
public class HouseController {

	@Autowired
	private HouseService houseService;

	@RequestMapping("/list.do")
	public String list(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "3") int pageSize,
			@RequestParam(defaultValue = "") String areaName, HttpSession session) {
		PageInfo<House> pageInfo = houseService.list(pageNo, pageSize, areaName);
		long total = pageInfo.getTotal();
		String valueOf = String.valueOf(total);
		int count = Integer.parseInt(valueOf);
		PageUtils utils = new PageUtils(String.valueOf(pageNo), count, pageSize);
		session.setAttribute("list", pageInfo.getList());
		session.setAttribute("page", utils.getPage());
		session.setAttribute("areaName", areaName);
		return "list";
	}

	@RequestMapping("/add.do")
	@ResponseBody
	public boolean add(House house) {
		int i = houseService.add(house);
		if (i > 0) {
			return true;
		}
		return false;
	}

	@RequestMapping("/update.do")
	@ResponseBody
	public boolean update(House house) {
		int i = houseService.update(house);
		if (i > 0) {
			return true;
		}
		return false;
	}

	@RequestMapping("/get.do")
	public String getById(Integer id, HttpSession session) {
		House house = houseService.getById(id);
		session.setAttribute("house", house);
		return "edit";
	}

	@RequestMapping("/delete.do")
	@ResponseBody
	public boolean delete(Integer id) {
		int i = houseService.deleteById(id);
		if (i > 0) {
			return true;
		}
		return false;
	}

	@RequestMapping("/to-add.do")
	public String toAdd() {
		return "add";
	}
}
