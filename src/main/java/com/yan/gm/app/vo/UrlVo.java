package com.yan.gm.app.vo;

import java.io.Serializable;

public class UrlVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 业务号
	 */
	private String tid;
	
	/**
	 * 网页的web根路径
	 */
	private String host;
	
	/**
	 * 相对链接
	 */
	private String rurl;
	
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 分类
	 */
	private String category;

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getRurl() {
		return rurl;
	}

	public void setRurl(String rurl) {
		this.rurl = rurl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
