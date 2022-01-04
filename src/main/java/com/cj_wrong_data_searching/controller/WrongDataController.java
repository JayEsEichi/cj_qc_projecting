package com.cj_wrong_data_searching.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cj_unit_group.service.UnitGroupService;
import com.cj_unit_group.vo.UnitGroupVO;
import com.cj_wrong_data_searching.service.WrongDataService;
import com.cj_wrong_data_searching.vo.WrongDataVO;
import com.google.gson.Gson;

@Controller
public class WrongDataController {
	
	@Inject
	WrongDataService wrongdataservice;
	
	
	@RequestMapping(value="/cj_wrong_data_search", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> cj_wrong_data_search(@RequestParam(required=false) String sku_title) {
		
		// get 형식으로 파라미터 값을 받아올 때 글자가 깨질 시, 결과를 나타내려는 jsp 페이지에서 형식을 utf-8 로  바꿔본다.
		System.out.println(sku_title);
		
		List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();
		Map<String, String> wrongdata = null;
		List<WrongDataVO> wrongdatalist = wrongdataservice.WrongDataList(sku_title);
		
		System.out.println("확인 용 1");
		
		for(WrongDataVO w:wrongdatalist) {
			wrongdata = new HashMap<String, String>();
			wrongdata.put("category", w.getCategory());
			wrongdata.put("sku_title", w.getSku_title());
			wrongdata.put("title_txt", w.getTitle_txt());
			wrongdata.put("opt_txt", w.getOpt_txt());
			wrongdata.put("unit_count", w.getUnit_count());
			wrongdata.put("group_count", w.getGroup_count());
			wrongdata.put("unit_price", w.getUnit_price());
			wrongdata.put("market_pid", w.getMarket_pid());
			wrongdata.put("addr", w.getAddr());
			dataList.add(wrongdata);
			System.out.println(dataList);
		}

		System.out.println("확인 용 2");
		
		Map<String, Object> wrongmappingdata = new HashMap<String, Object>();
		wrongmappingdata.put("wrongmappingdata", dataList);
		
		return wrongmappingdata; 
		
	}
	
}
