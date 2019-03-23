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

	/**
	 * 扩展字段1
	 */
	private String ext1;
	
	/**
	 * 扩展字段2
	 */
	private String ext2;
	
	/**
	 * 扩展字段3
	 */
	private String ext3;
	
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

	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}

	public String getExt2() {
		return ext2;
	}

	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}

	public String getExt3() {
		return ext3;
	}

	public void setExt3(String ext3) {
		this.ext3 = ext3;
	}
	
}
