package com.yan.gm.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yan.gm.app.schema.UrlRec;

@Mapper
public interface UrlRecMapper {

	void insertUrlRec(UrlRec urlRec);
	
	List<UrlRec> findUrlRecsByTitle(String title);
	
	UrlRec findUrlRecByTID(String tid);
		
}
