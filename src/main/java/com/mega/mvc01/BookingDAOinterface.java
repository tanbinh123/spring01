package com.mega.mvc01;

import java.util.List;

public interface BookingDAOinterface {

	List<BookingDTO> list3();

	void create(BookingDTO bookingDTO);

}