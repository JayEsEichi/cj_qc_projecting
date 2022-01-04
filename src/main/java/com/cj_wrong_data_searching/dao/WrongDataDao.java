package com.cj_wrong_data_searching.dao;

import java.util.List;

import com.cj_wrong_data_searching.vo.WrongDataVO;

public interface WrongDataDao {
	
	public List<WrongDataVO> WrongDataList(String sku_title);
	
}
