package com.xxh.fang.api;

import java.util.List;
import java.util.Map;

import com.xxh.fang.entity.CustomerAndProductVo;
import com.xxh.fang.entity.ProductAndSkuVo;
import com.xxh.fang.entity.ProductVo;

public interface ProductApi {

	public List<ProductVo> findAll();
	
	/**
	 *区查询
	 * 
	 * @return
	 */
	public List<CustomerAndProductVo> findAllAndTheListOf(String aera);
	
	/**
	 * 用户产品表
	 * @return
	 */
	public List<CustomerAndProductVo>customerAndProductFind();
	
	/**
	 * 产品id查询
	 */
	public List<Map<String, Object>> findProductId(ProductAndSkuVo productAndSkuvo);

}
