package com.mega.mvc01;

import java.util.List;

public interface BbsDAOinterface {

	int createAsk(CreateAskDTO dtoCreateAskDTO);

	List<MovieListDTO> showAllMovieList2();

	List<TheaterDTO> showTheaterinfo();

	int createReview(MovieReviewDTO dtoMovieReviewDTO);

	List<CreateAskDTO> showAsk();

	List<CreateAskDTO> showAskOnlyTitle(String THEATERNAME);

	List<MovieReviewDTO> showAllReviewPage();

	List<MovieReviewDTO> ReviewBoardNextPage(String startNum);

	List<MovieReviewDTO> ReviewBoardNextPage2(String startNum);

	List<MovieReviewDTO> showAllReview();

	CreateAskDTO showAskDetail(int ASKNUM);

	int askNumPlus(int asknum);

	int deleteAsk(int asknum);

	int updateAsk(CreateAskDTO dtoAskDTO);

	int reviewNumPlus(int reviewnum);

	MovieReviewDTO showReviewDetail(int REVIEWNUM);

	int deleteReview(int reviewnum);

	int updateReview(MovieReviewDTO dtoReviewDTO);

	List<MovieReviewDTO> reviewDesc();

	List<MovieReviewDTO> showOrderByTitle();

}