package com.mega.mvc01;

import java.util.List;

public interface MovieListDAO1interface {

	List<MovieListDTO1> showAllMovieList();

	MovieListDTO1 one(MovieListDTO1 movieList);

}