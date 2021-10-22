package com.mega.mvc01;

import java.util.List;

public interface EveDAOinterface {

	List<EveDTO> list2();

	List<EveDTO> list3();

	EveDTO read(EveDTO eveDTO);

	EveDTO one(EveDTO eveDTO);

}