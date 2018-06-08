package com.xxh.fang.api;

import java.util.List;

import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.CustomerAndProductVo;
import com.xxh.fang.entity.ProductAndSkuBO;
import com.xxh.fang.entity.ProductAndSkuVo;
import com.xxh.fang.entity.ProductVo;

public interface ProductApi {

	/**
	 * 查询产品所有
	 */
	public ResVo findAll(Long customerId);

	/**
	 * 区查询
	 * 
	 * @return
	 */
	public ResVo findAllAndTheListOf(String aera);

	/**
	 * 用户产品表
	 * 
	 * @return
	 */
	public ResVo customerAndProductFind();

	/**
	 * 产品id查询
	 */
	public ProductAndSkuVo findProductAndSku(ProductAndSkuVo productAndSkuVo);

	/**
	 * 閲讀數
	 * 
	 * @param productId
	 * @return
	 */
	public ResVo modifyreadthenumber(Long productId);
	
	public ResVo addProduct(ProductAndSkuBO product);
}
