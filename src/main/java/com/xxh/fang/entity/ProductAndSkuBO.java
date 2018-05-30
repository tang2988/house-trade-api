package com.xxh.fang.entity;

import java.util.List;

public class ProductAndSkuBO {

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
