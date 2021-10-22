package com.mega.mvc01;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StoreDAO implements StoreDAOinterface {
	
	
	@Autowired
	SqlSessionTemplate my;
//	
//	public List<StoreDTO> name() {
//		
//	}
//	
	
	@Override
	public void create(StoreDTO storeDTO) {
		System.out.println(storeDTO);
		my.insert("store.create", storeDTO);
	}
}
