package com.cj_unit_group.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.cj_unit_group.vo.UnitGroupVO;


@Repository
public class UnitGroupDaoImpl implements UnitGroupDao{

	@Inject
	SqlSession	sqlsession;
	
	
	@Override
	public List<UnitGroupVO> UnitGroupRatio(String category){
		return sqlsession.selectList("cj.unit_group", category); 	
	}
	
	@Override
	public List<UnitGroupVO> getCountAddress(String category) {
		return sqlsession.selectList("cj.unit_group_ratio", category); 
	}
	
	@Override
	public List<UnitGroupVO> RatioGraph(String ratiograph){
		return sqlsession.selectList("cj.ratio_graph", ratiograph); 	
	}
	
		
	
}
