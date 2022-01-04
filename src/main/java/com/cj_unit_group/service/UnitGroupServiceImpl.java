package com.cj_unit_group.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cj_unit_group.dao.UnitGroupDao;
import com.cj_unit_group.vo.UnitGroupVO;


@Service
public class UnitGroupServiceImpl implements UnitGroupService{
	
	@Inject
	UnitGroupDao unitgroupdao;
	
	@Override
	public List<UnitGroupVO> UnitGroupRatio(String category){
		return unitgroupdao.UnitGroupRatio(category);
	}
	
	@Override
	public List<UnitGroupVO> getCountAddress(String category) {
		return unitgroupdao.getCountAddress(category);
	}
	
	@Override
	public List<UnitGroupVO> RatioGraph(String ratiograph){
		return unitgroupdao.RatioGraph(ratiograph);
	}
}
