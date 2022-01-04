package com.home.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cj_unit_group.service.UnitGroupService;
import com.cj_unit_group.vo.UnitGroupVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	UnitGroupService unitgroupservice;
	
	
	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("msg", "메인화면(미완성)");
		return "main";
	}
	
	@RequestMapping("return_main.do")
	public String return_main() {
		
		return "main";
	}
	
	@RequestMapping(value = "home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	//GET 은 서버에 데이터 정보를 요청하여 보여주는 용도로 주로 사용 (select)
	//POST 는 서버에 데이터 업데이트, 삭제, 삽입 같은 조작 용도로 주로 사용 (update, delete, insert)
	@ResponseBody
	@RequestMapping(value="/cj_category", method=RequestMethod.GET)
	public Map<String, Object> cj_category(@RequestParam(required=false) String category) {
		
		System.out.println("HomeController");
		System.out.println(category);
		
		List<Map<String,String>> dataList = new ArrayList<Map<String, String>>();
		Map<String, String> data = null;
		List<UnitGroupVO> ratiolist = unitgroupservice.UnitGroupRatio(category);
		
		System.out.println("1 = " + ratiolist);
		
		for(UnitGroupVO u:ratiolist) {
			data = new HashMap<String, String>();
			data.put("category", u.getCategory());
			data.put("unit_count", u.getUnit_count());
			data.put("group_count", u.getGroup_count());
			data.put("cnt", u.getCnt());
			data.put("ratio", u.getRatio());
			dataList.add(data);
			System.out.println(data);
		}
		
		System.out.println("2 = " + data);
		
		Map<String, Object> ratio = new HashMap<String, Object>();
		ratio.put("ratio", dataList);
		
		return ratio;
	}
	

}
