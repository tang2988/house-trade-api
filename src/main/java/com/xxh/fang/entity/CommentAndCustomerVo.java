package com.xxh.fang.entity;

import java.io.Serializable;
import java.util.Date;

public class CommentAndCustomerVo implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = 3046989764301364952L;

	/**
	 * 昵称
	 */
	public String nickName;

	/**
	 * 用户头像
	 */
	public String headerIconUrl;

	/**
	 * 评论id
	 */
	public Long commentOnID;

	/**
	 * 评论人
	 */
	public Long customerId;

	/**
	 * 内容
	 */
	public String content;

	/**
	 * 评论时间
	 */
	public Date commentOfTime;

	/**
	 * 产品id
	 */
	public Long product_id;

	/**
	 * 点赞数
	 */
	public Long pointOfpraise;

	public CommentAndCustomerVo() {
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

	public Long getCommentOnID() {
		return commentOnID;
	}

	public void setCommentOnID(Long commentOnID) {
		this.commentOnID = commentOnID;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCommentOfTime() {
		return commentOfTime;
	}

	public void setCommentOfTime(Date commentOfTime) {
		this.commentOfTime = commentOfTime;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Long getPointOfpraise() {
		return pointOfpraise;
	}

	public void setPointOfpraise(Long pointOfpraise) {
		this.pointOfpraise = pointOfpraise;
	}

	public String toString() {
		return "CommentAndCustomerVo [nickName=" + nickName + ", headerIconUrl=" + headerIconUrl + ", commentOnID="
				+ commentOnID + ", customerId=" + customerId + ", content=" + content + ", commentOfTime="
				+ commentOfTime + ", product_id=" + product_id + ", pointOfpraise=" + pointOfpraise + "]";
	}

}
