package com.cj_wrong_data_searching.service;

import java.util.List;

import com.cj_wrong_data_searching.vo.WrongDataVO;

public interface WrongDataService {
	
	public List<WrongDataVO> WrongDataList(String sku_title);
	
}
