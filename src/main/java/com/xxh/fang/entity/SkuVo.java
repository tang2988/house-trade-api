package com.xxh.fang.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class SkuVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6698278388769419247L;
	
	/**
	 * skuid
	 */
	public Long skuid;
	/**
	 * 产品Id
	 */
	public Long productid;

	/**
	 * 房子类型
	 */
	public String typeOfHouse;
	/**
	 * 价格
	 */
	public BigDecimal price;
	/**
	 * 面积
	 */
	public int flat;
	/**
	 * 库存
	 */
	public int Stock;


	public Long getSkuid() {
		return skuid;
	}

	public void setSkuid(Long skuid) {
		this.skuid = skuid;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public String getTypeOfHouse() {
		return typeOfHouse;
	}

	public void setTypeOfHouse(String typeOfHouse) {
		this.typeOfHouse = typeOfHouse;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getFlat() {
		return flat;
	}

	public void setFlat(int flat) {
		this.flat = flat;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public String toString() {
		return "Sku [skuid=" + skuid + ", productid=" + productid + ", typeOfHouse=" + typeOfHouse + ", price=" + price
				+ ", flat=" + flat + ", Stock=" + Stock + "]";
	}

}
