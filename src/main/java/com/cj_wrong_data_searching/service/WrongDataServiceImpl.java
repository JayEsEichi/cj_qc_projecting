package com.cj_wrong_data_searching.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cj_wrong_data_searching.dao.WrongDataDao;
import com.cj_wrong_data_searching.vo.WrongDataVO;

@Service
public class WrongDataServiceImpl implements WrongDataService{

	@Inject
	WrongDataDao wrongdatadao;
	
	@Override
	public List<WrongDataVO> WrongDataList(String sku_title){
		return wrongdatadao.WrongDataList(sku_title);
	}
	
}
