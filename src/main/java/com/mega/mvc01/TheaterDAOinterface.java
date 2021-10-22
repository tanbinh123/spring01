package com.mega.mvc01;

import java.util.List;

public interface TheaterDAOinterface {

	TheaterDTO readOne(TheaterDTO theaterDTO);

	List<TheaterDTO> list();

}