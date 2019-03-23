package com.yan.gm.app.util;

import com.yan.gm.app.schema.UrlExt;
import com.yan.gm.app.schema.UrlRec;
import com.yan.gm.app.vo.UrlVo;

public class VoTranslateUtl {

	public static UrlRec assembleUrlVoToUrlRecSchema(UrlVo urlVo){
		// 组装UrlRec对象
		UrlRec urlRec = new UrlRec();
		urlRec.setTid(urlVo.getTid());
		urlRec.setHost(urlVo.getHost());
		urlRec.setTitle(urlVo.getTitle());
		urlRec.setRurl(urlVo.getRurl());
		
		return urlRec;
	}
	
	public static UrlExt assembleUrlVoToUrlExtSchema(UrlVo urlVo){
		// 组装UrlExt对象
		UrlExt urlExt = new UrlExt();
		urlExt.setTid(urlVo.getTid());
		urlExt.setHost(urlVo.getHost());
		urlExt.setCategory(urlVo.getCategory());
		urlExt.setExt1(urlVo.getExt1());
		urlExt.setExt2(urlVo.getExt2());
		urlExt.setExt3(urlVo.getExt3());
		
		return urlExt;
	}
	
	public static UrlVo assembleSchemaToUrlVo(UrlRec urlRec, UrlExt urlExt){
		// 组装UrlExt对象
		UrlVo urlVo = new UrlVo();
		if(urlRec != null) {
			urlVo.setTid(urlRec.getTid());
			urlVo.setHost(urlRec.getHost());
			urlVo.setTitle(urlRec.getTitle());
			urlVo.setRurl(urlRec.getRurl());
		}
		
		if(urlExt != null) {
			urlVo.setCategory(urlExt.getCategory());
			urlVo.setExt1(urlExt.getExt1());
			urlVo.setExt2(urlExt.getExt2());
			urlVo.setExt3(urlExt.getExt3());
		}
		return urlVo;
	}
}
