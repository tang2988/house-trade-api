package com.xxh.fang.entity;

import java.io.Serializable;
import java.util.List;

public class ProductAndSkuBO implements Serializable{
	
	

	/**
	 * 
	 */
	public static final long serialVersionUID = -6344341630683002299L;
	
	ProductVo productVo;
	List<SkuVo> skuList;
	public ProductVo getProductVo() {
		return productVo;
	}
	public void setProductVo(ProductVo productVo) {
		this.productVo = productVo;
	}
	public List<SkuVo> getSkuList() {
		return skuList;
	}
	public void setSkuList(List<SkuVo> skuList) {
		this.skuList = skuList;
	}

}
