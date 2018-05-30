package com.xxh.fang.entity;

import java.io.Serializable;

public class CustomerAndProductVo implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = 6306884421116376745L;

	public Long product_id;
	public String nickName;
	public String headerlconUrl;
	public String title;
	public String subtitle;
	public String masterGraph;

	public CustomerAndProductVo() {
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeaderlconUrl() {
		return headerlconUrl;
	}

	public void setHeaderlconUrl(String headerlconUrl) {
		this.headerlconUrl = headerlconUrl;
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
		return "CustomerAndProductPo [nickName=" + nickName + ", headerlconUrl=" + headerlconUrl + ", title=" + title
				+ ", subtitle=" + subtitle + ", masterGraph=" + masterGraph + "]";
	}

	
}
