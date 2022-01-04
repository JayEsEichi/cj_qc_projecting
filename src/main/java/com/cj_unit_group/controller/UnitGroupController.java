package com.cj_unit_group.controller;

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

import com.google.gson.Gson;

@Controller
public class UnitGroupController {
	
	@Inject
	UnitGroupService unitgroupservice;
	
	
	@RequestMapping(value="/cj_ratio_graph", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String cj_ratio_graph(@RequestParam(required=false) String category ,Model model) {
		System.out.println("그래프 추출 용 카테고리 : " + category);
		
		//그래프 추출 테스트용
		//ratiograph = "당";
		//테스트 시 정상 그래프 추출 확인됨.
		
		Gson gson = new Gson();
		List<UnitGroupVO> list = unitgroupservice.RatioGraph(category);
	
		return gson.toJson(list);
		
	}
	
	// 페이지 이동 시 responsebody 어노테이션은 뺄것
	@RequestMapping(value="/each_model_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String each_model_view() {
		
		return "/each_model_view";
		
	}
	
	@RequestMapping(value="/not_matching_hatban_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_hatban_data_view() {
		
		return "/Not_Matching_Data/not_matching_hatban_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_cupban_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_cupban_data_view() {
		
		return "/Not_Matching_Data/not_matching_cupban_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_cookmeat_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_cookmeat_data_view() {
		
		return "/Not_Matching_Data/not_matching_cookmeat_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_cookrefrig_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_cookrefrig_data_view() {
		
		return "/Not_Matching_Data/not_matching_cookrefrig_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_deepingsauce_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_deepingsauce_data_view() {
		
		return "/Not_Matching_Data/not_matching_deepingsauce_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_innerbe_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_innerbe_data_view() {
		
		return "/Not_Matching_Data/not_matching_innerbe_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_lactobacillus_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_lactobacillus_data_view() {
		
		return "/Not_Matching_Data/not_matching_lactobacillus_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_fresh_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_fresh_data_view() {
		
		return "/Not_Matching_Data/not_matching_fresh_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_spamgift_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_spamgift_data_view() {
		
		return "/Not_Matching_Data/not_matching_spamgift_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_spam_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_spam_data_view() {
		
		return "/Not_Matching_Data/not_matching_spam_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_sauce_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_sauce_data_view() {
		
		return "/Not_Matching_Data/not_matching_sauce_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_fish_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_fish_data_view() {
		
		return "/Not_Matching_Data/not_matching_fish_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_ppeuttichel_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_ppeuttichel_data_view() {
		
		return "/Not_Matching_Data/not_matching_ppeuttichel_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_porridge_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_porridge_data_view() {
		
		return "/Not_Matching_Data/not_matching_porridge_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_dumpling_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_dumpling_data_view() {
		
		return "/Not_Matching_Data/not_matching_dumpling_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_powder_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_powder_data_view() {
		
		return "/Not_Matching_Data/not_matching_powder_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_noodle_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_noodle_data_view() {
		
		return "/Not_Matching_Data/not_matching_noodle_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_returnup_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_returnup_data_view() {
		
		return "/Not_Matching_Data/not_matching_returnup_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_sweet_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_sweet_data_view() {
		
		return "/Not_Matching_Data/not_matching_sweet_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_dasida_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_dasida_data_view() {
		
		return "/Not_Matching_Data/not_matching_dasida_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_dadam_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_dadam_data_view() {
		
		return "/Not_Matching_Data/not_matching_dadam_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_simplefood_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_simplefood_data_view() {
		
		return "/Not_Matching_Data/not_matching_simplefood_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_icenoodle_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_icenoodle_data_view() {
		
		return "/Not_Matching_Data/not_matching_icenoodle_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_kimchi_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_kimchi_data_view() {
		
		return "/Not_Matching_Data/not_matching_kimchi_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_soup_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_soup_data_view() {
		
		return "/Not_Matching_Data/not_matching_soup_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_competitor_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_competitor_data_view() {
		
		return "/Not_Matching_Data/not_matching_competitor_data_view";
		
	}
	
	@RequestMapping(value="/not_matching_snack_data_view.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String not_matching_snack_data_view() {
		
		return "/Not_Matching_Data/not_matching_snack_data_view";
		
	}
	
	@RequestMapping(value="/bootstrap_test.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String bootstrap_test() {
		
		return "/bootstrap_test";
		
	}
}
