package com.mega.mvc01;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

@Repository
public class BookingDAO implements BookingDAOinterface {

	@Autowired
	SqlSessionTemplate mybatis;

	@Override
	public List<BookingDTO> list3() {
		List<BookingDTO> list3 = mybatis.selectList("booking.all");// 맵퍼에잇는거
		return list3;
	}

	@Override
	public void create(BookingDTO bookingDTO) {
		System.out.println(bookingDTO);
		int result = mybatis.insert("booking.add", bookingDTO);
		System.out.println(result);
	}
}
