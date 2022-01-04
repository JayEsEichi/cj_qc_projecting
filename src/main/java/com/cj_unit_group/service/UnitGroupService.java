package com.cj_unit_group.service;

import java.util.List;

import com.cj_unit_group.vo.UnitGroupVO;
import com.mysql.cj.xdevapi.JsonArray;

public interface UnitGroupService {
	
	public List<UnitGroupVO> UnitGroupRatio(String category);
	
	public List<UnitGroupVO> getCountAddress(String category);
	
	public List<UnitGroupVO> RatioGraph(String ratiograph);
}
