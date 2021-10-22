package com.mega.mvc01;

import java.util.List; 

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class EveDAO implements EveDAOinterface {
	
	
	@Autowired
	SqlSessionTemplate myBatis; //100 <-- null
	
	@Override
	public List<EveDTO> list2() {
		List<EveDTO> list = myBatis.selectList("event.all");
		return list;
	}
	
	@Override
	public List<EveDTO> list3() {
		List<EveDTO> list = myBatis.selectList("event.all");
		return list;
	}
	
	@Override
	public EveDTO read(EveDTO eveDTO) {
		EveDTO dto = myBatis.selectOne("event.one", eveDTO);
		return dto;
	}
	
	@Override
	public EveDTO one(EveDTO eveDTO) {
		System.out.println(eveDTO);
		return myBatis.selectOne("event.one", eveDTO);
	}
	

}
