package com.bw.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class House implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String areaName;
	private BigDecimal totalArea;
	private BigDecimal rentPrice;
	private String rentDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public BigDecimal getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(BigDecimal totalArea) {
		this.totalArea = totalArea;
	}

	public BigDecimal getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(BigDecimal rentPrice) {
		this.rentPrice = rentPrice;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public House() {
		super();
	}

	public House(Integer id, String areaName, BigDecimal totalArea, BigDecimal rentPrice, String rentDate) {
		super();
		this.id = id;
		this.areaName = areaName;
		this.totalArea = totalArea;
		this.rentPrice = rentPrice;
		this.rentDate = rentDate;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", areaName=" + areaName + ", totalArea=" + totalArea + ", rentPrice=" + rentPrice
				+ ", rentDate=" + rentDate + "]";
	}

}
