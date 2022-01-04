package com.cj_unit_group.dao;

import java.util.List;

import com.cj_unit_group.vo.UnitGroupVO;


public interface UnitGroupDao {
	public List<UnitGroupVO> UnitGroupRatio(String category);
	
	// 그룹주소에 해당하는 카운트 메소드
	public List<UnitGroupVO> getCountAddress(String category);

	public List<UnitGroupVO> RatioGraph(String ratiograph);
}
