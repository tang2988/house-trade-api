package com.xxh.fang.entity;

import java.io.Serializable;

public class CustomerAndProductVo implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = -2976863837794904398L;
	/**
	 * 
	 */


	public Long product_id;
	public String nickName;
	public String headerIconUrl;
	public String title;
	public String subtitle;
	public String masterGraph;

	public CustomerAndProductVo() {
	}

	
	
	public Long getProduct_id() {
		return product_id;
	}



	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}



	public String getNickName() {
		return nickName;
	}
	

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	

	public String getHeaderIconUrl() {
		return headerIconUrl;
	}



	public void setHeaderIconUrl(String headerIconUrl) {
		this.headerIconUrl = headerIconUrl;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getMasterGraph() {
		return masterGraph;
	}

	public void setMasterGraph(String masterGraph) {
		this.masterGraph = masterGraph;
	}

	public String toString() {
		return "CustomerAndProductVo [nickName=" + nickName + ", headerlconUrl=" + headerIconUrl + ", title=" + title
				+ ", subtitle=" + subtitle + ", masterGraph=" + masterGraph + "]";
	}

	
}
