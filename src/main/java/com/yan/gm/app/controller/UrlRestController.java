package com.yan.gm.app.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yan.gm.app.mapper.UrlExtMapper;
import com.yan.gm.app.mapper.UrlRecMapper;
import com.yan.gm.app.schema.UrlExt;
import com.yan.gm.app.schema.UrlRec;
import com.yan.gm.app.util.VoTranslateUtl;
import com.yan.gm.app.vo.ResponseVo;
import com.yan.gm.app.vo.UrlVo;

@RestController
public class UrlRestController {
	
	// 前台向后台传数组时，使用分隔符分隔数组中元素
	public static final String ARRAY_STR_SEPARATOR = "__SEPARATOR__";
	
	@Autowired
	private UrlExtMapper urlExtMapper;
	
	@Autowired
	private UrlRecMapper urlRecMapper;
		
	@RequestMapping("/saveurl")
	@ResponseBody
	public ResponseVo saveUrl(String tid, String host, String rurl, String title, String category, String ext1, String ext2, String ext3) {
		ResponseVo responseVo = new ResponseVo();
		
		// 先根据tid判断下是否存在
		UrlRec urlRec = urlRecMapper.findUrlRecByTID(tid);
		
		if(urlRec == null){
			
			// 组装UrlRec对象
			urlRec = new UrlRec();
			urlRec.setTid(tid);
			urlRec.setHost(host);
			urlRec.setTitle(title);
			urlRec.setRurl(rurl);
			
			urlRec.setValidStatus("1");
			urlRec.setInsertTime(new Date());
			urlRec.setUpdateTime(new Date());
			
			// 组装UrlExt对象
			UrlExt urlExt = new UrlExt();
			urlExt.setTid(tid);
			urlExt.setHost(host);
			urlExt.setCategory(category);
			urlExt.setExt1(ext1);
			urlExt.setExt2(ext2);
			urlExt.setExt3(ext3);
			
			urlExt.setValidStatus("1");
			urlExt.setInsertTime(new Date());
			urlExt.setUpdateTime(new Date());
			
			// 数据更新到数据库
			urlRecMapper.insertUrlRec(urlRec);
			urlExtMapper.insertUrlExt(urlExt);
			
			// 组装返回vo
			UrlVo urlVo = VoTranslateUtl.assembleSchemaToUrlVo(urlRec, urlExt);
			
			responseVo.setSuccess(true);
			responseVo.setErrorMsg("");
			responseVo.setResult(urlVo);
		}else{
			responseVo.setSuccess(false);
			responseVo.setErrorMsg("");
			responseVo.setResult(null);
		}
		
		return responseVo;
	}
	
	@RequestMapping("/findurl")
	@ResponseBody
	public ResponseVo findurl(String titlestr) {
		ResponseVo responseVo = new ResponseVo();
		
		// System.out.println(titlestr);
		
		if(titlestr != null && !"".equals(titlestr)) {
			// 将数组字符串通过分隔符分隔为数组
			String[] titles = titlestr.split(ARRAY_STR_SEPARATOR);
			
			if (titles != null && titles.length > 0) {
				List<UrlVo> urlVos = new ArrayList<>();
				for(String title : titles) {
					//title = URLDecoder.decode(title, "utf-8");
					UrlVo urlVo = null;
					List<UrlRec> urlRecs = urlRecMapper.findUrlRecsByTitle(title);
					
					if(urlRecs != null && urlRecs.size() > 0) {
						UrlRec urlRec = urlRecs.get(0);
						
						// 根据tid查urlext
						UrlExt urlExt = urlExtMapper.findUrlExtByTID(urlRec.getTid());
						
						urlVo = VoTranslateUtl.assembleSchemaToUrlVo(urlRec, urlExt);
					}
					
					// 不管有没有查到数据，都需要将vo放到list中，因为前台还需要根据数组一一对应
					urlVos.add(urlVo);
				}
				
				responseVo.setResults(urlVos);
				
				responseVo.setSuccess(true);
				responseVo.setErrorMsg("");
			}else {
				responseVo.setSuccess(false);
				responseVo.setErrorMsg("请传入title数据");
			}
		}else {
			responseVo.setSuccess(false);
			responseVo.setErrorMsg("请传入title数据");
		}
		
		return responseVo;
	}
	
}
