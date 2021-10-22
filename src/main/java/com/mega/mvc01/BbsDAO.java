package com.mega.mvc01;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO implements BbsDAOinterface {

	@Autowired
	SqlSessionTemplate my;


	@Override
	public int createAsk(CreateAskDTO dtoCreateAskDTO) {// 문의 게시글 작성
		int result = my.insert("cBbs.createAsk", dtoCreateAskDTO);
		// List<MovieReviewDTO> dto2=my.selectList("cBbs.review",MOVIENUM);
		return result;
	}
	@Override
	public List<MovieListDTO> showAllMovieList2() {// 영화 목록 전체 다 read
		List<MovieListDTO> dto = my.selectList("cBbs.showAllMovieList");
		return dto;
	}
	
	
	@Override
	public List<TheaterDTO> showTheaterinfo() {// 문의 쓸껀데 극장정보 갖고와!!!!
		List<TheaterDTO> result = my.selectList("cBbs.showTheater");
		return result;
	}

	@Override
	public int createReview(MovieReviewDTO dtoMovieReviewDTO) {// 리뷰 작성
		int result = my.insert("cBbs.createReview", dtoMovieReviewDTO);
		// List<MovieReviewDTO> dto2=my.selectList("cBbs.review",MOVIENUM);
		return result;
	}

	@Override
	public List<CreateAskDTO> showAsk() {// 문의 게시판 갖고와
		// MovieReviewDTO dto2 = my.selectOne("cBbs.review", MOVIENUM);
		List<CreateAskDTO> dto = my.selectList("cBbs.showAsk");
		return dto;
	}
	
	@Override
	public List<CreateAskDTO> showAskOnlyTitle(String THEATERNAME) {// 문의 게시판 제목순으로 갖고와
		List<CreateAskDTO> dto = my.selectList("cBbs.showAskOnlyTitle",THEATERNAME);
		return dto;
	}
	
	@Override
	public List<MovieReviewDTO> showAllReviewPage() {// 리뷰 게시판 갖고와(전체)
		List<MovieReviewDTO> dto = my.selectList("cBbs.showAllReview");
		return dto;
	}
	
	@Override
	public List<MovieReviewDTO> ReviewBoardNextPage(String startNum) {// 리뷰 게시판 원하는 페이지!!!!!!!! 1페이지 2페이지 3페이
		//System.out.println("dao에서 도착한 스타트넘버:"+startNum);
		List<MovieReviewDTO> dto = my.selectList("cBbs.ReviewBoardNextPage",startNum);
		return dto;
	}
	
	
	@Override
	public List<MovieReviewDTO> ReviewBoardNextPage2(String startNum) {// 리뷰 게시판 원하는 페이지!!!!!!!! 1페이지 2페이지 3페이
		//System.out.println("dao에서 도착한 스타트넘버:"+startNum);
		List<MovieReviewDTO> dto = my.selectList("cBbs.ReviewBoardNextPage2",startNum);
		return dto;
	}
	
	
	@Override
	public List<MovieReviewDTO> showAllReview() {// 영화 리뷰 테이블 갖고와
		// MovieReviewDTO dto2 = my.selectOne("cBbs.review", MOVIENUM);
		List<MovieReviewDTO> dto = my.selectList("cBbs.showReview");
		return dto;
	}



	@Override
	public CreateAskDTO showAskDetail(int ASKNUM) {// 문의 상세페이지 보여줘
		CreateAskDTO dto = my.selectOne("cBbs.showAskDetail", ASKNUM);
		return dto;
	}

	@Override
	public int askNumPlus(int asknum) {// 문의 상세페이지 조회수 업!
		int result = my.update("cBbs.viewCountPlus", asknum);
		return result;
	}
	
	@Override
	public int deleteAsk(int asknum) {// 문의 제거
		int result = my.delete("cBbs.deleteAsk", asknum);
		return result;
	}
	
	@Override
	public int updateAsk(CreateAskDTO dtoAskDTO) {// 문의 수정
		int result = my.update("cBbs.updateAsk",dtoAskDTO);
		return result;
	}
	
	@Override
	public int reviewNumPlus(int reviewnum) {// 리뷰 상세페이지 조회수 업!
		int result = my.update("cBbs.reviewCountPlus", reviewnum);
		return result;
	}
	
	@Override
	public MovieReviewDTO showReviewDetail(int REVIEWNUM) {// 문의 상세페이지 보여줘
		MovieReviewDTO dto = my.selectOne("cBbs.showReviewDetail", REVIEWNUM);
		return dto;
	}
	
	@Override
	public int deleteReview(int reviewnum) {// 리뷰 제거
		int result = my.delete("cBbs.deleteReview", reviewnum);
		return result;
	}
	
	@Override
	public int updateReview(MovieReviewDTO dtoReviewDTO) {// 문의 수정
		int result = my.update("cBbs.updateReview",dtoReviewDTO);
		return result;
	}
	
	
	@Override
	public List<MovieReviewDTO> reviewDesc() {// 영화 리뷰 테이블 조회수 높은순으로!
		// MovieReviewDTO dto2 = my.selectOne("cBbs.review", MOVIENUM);
		List<MovieReviewDTO> dto = my.selectList("cBbs.showReviewDesc");
		return dto;
	}
	
	/*
	 * public List<MovieReviewDTO> showAllReviewPageOrderByViewCount() {// 영화 리뷰 테이블
	 * 조회수 높은순으로! // MovieReviewDTO dto2 = my.selectOne("cBbs.review", MOVIENUM);
	 * List<MovieReviewDTO> dto =
	 * my.selectList("cBbs.showReviewDescOrderByViewCount"); return dto; }
	 */
	
	@Override
	public List<MovieReviewDTO> showOrderByTitle() {// 영화 리뷰 테이블 제목순으로!
		List<MovieReviewDTO> dto = my.selectList("cBbs.showReviewOderByTitle");
		return dto;
	}

}
