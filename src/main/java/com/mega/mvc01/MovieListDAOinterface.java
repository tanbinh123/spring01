package com.mega.mvc01;

import java.util.List;

public interface MovieListDAOinterface {

	MovieListDTO showMovieDetail(String MOVIENUM);

	List<MovieReviewDTO> showMovieReview(String MOVIENUM);

	String showMovieCount(String MOVIENUM);

	String showMovieGrade(String MOVIENUM);

	List<MovieListDTO> showAllMovieList();

}