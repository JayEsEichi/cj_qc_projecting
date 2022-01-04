package com.cj_wrong_data_searching.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.cj_wrong_data_searching.vo.WrongDataVO;

@Repository
public class WrongDataDaoImpl implements WrongDataDao{
	
	@Inject
	SqlSession sqlsession;
	
	@Override
	public List<WrongDataVO> WrongDataList(String sku_title){
		return sqlsession.selectList("cj.wrong_data_search", sku_title);
	}
	
}
