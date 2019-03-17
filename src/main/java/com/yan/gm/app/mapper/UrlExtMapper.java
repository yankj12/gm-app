package com.yan.gm.app.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.yan.gm.app.schema.UrlExt;

@Mapper
public interface UrlExtMapper {

	void insertUrlExt(UrlExt urlExt);
	
	UrlExt findUrlExtByTID(String tid);
}
