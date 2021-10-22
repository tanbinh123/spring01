package com.mega.mvc01;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieListDAO implements MovieListDAOinterface {

	@Autowired
	SqlSessionTemplate my;

	@Override
	public MovieListDTO showMovieDetail(String MOVIENUM) {// 영화 상세페이지 갖고와
		MovieListDTO dto = my.selectOne("cBbs.movie", MOVIENUM); // 이거는 one이 맞음.
		return dto;
	}

	@Override
	public List<MovieReviewDTO> showMovieReview(String MOVIENUM) {// 영화 리뷰 테이블 갖고와
		// MovieReviewDTO dto2 = my.selectOne("cBbs.review", MOVIENUM);
		List<MovieReviewDTO> dto2 = my.selectList("cBbs.review", MOVIENUM);
		return dto2;
	}
	
	
	  @Override
	public String showMovieCount(String MOVIENUM) {// booking 테이블 예매 관객 수 count 건웅님 booking 테이블 select count
	  String showCount =my.selectOne("cBbs.showViewerCount",MOVIENUM);
	  return showCount;
	  }
	 

	@Override
	public String showMovieGrade(String MOVIENUM) {// 영화 리뷰 평점 계산
		// MovieReviewDTO dto2 = my.selectOne("cBbs.review", MOVIENUM);
		String avg = my.selectOne("cBbs.gradeAvg", MOVIENUM);
		return avg;
	}
	@Override
	public List<MovieListDTO> showAllMovieList() {// 영화 목록 전체 다 read
		List<MovieListDTO> dto = my.selectList("cBbs.showAllMovieList");
		return dto;
	}


}
