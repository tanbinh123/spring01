package com.mega.mvc01;

import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieListController {

	@Autowired
	MovieListDAOinterface dao;

	// 영화 목록 페이지 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	@RequestMapping("movieList.do") // 영화목록
	public void movieList(Model model) {
		List<MovieListDTO> dto = dao.showAllMovieList();
		model.addAttribute("movieList", dto);
	}

	// 영화 상세 페이지 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	@RequestMapping("movieDetail.do") // 영화 상세 페이지 보여종
	public void movieDetail(String MOVIENUM, String MOVIETITLE, Model model) throws ParseException {
		MovieListDTO dto = dao.showMovieDetail(MOVIENUM);
		model.addAttribute("dto", dto);

		List<MovieReviewDTO> dto2 = dao.showMovieReview(MOVIENUM); // 리뷰도
		if (dto2.isEmpty()) {
			// System.out.println("비어있다");
			model.addAttribute("dto2", null);
		} else {
			model.addAttribute("dto2", dto2);
		}

		String dto3 = dao.showMovieGrade(MOVIENUM); // 평점 구하기
		model.addAttribute("dto3", dto3);

		// 누적 관객 수 !! 건웅님 booking 테이블 movie num 카운트해서 가져오기
		String dto4 = dao.showMovieCount(MOVIENUM);
		model.addAttribute("count", dto4);

		String search = ApiExamSearchBlog.search(MOVIETITLE);
		System.out.println(search);
		JSONParser jsonParser = new JSONParser(); // 문자열을 Json 형식에 맞게 Object로 파싱할 수 있는 Parser를 생성한다.
		Object obj = jsonParser.parse(search); // jsonParser를 통해 Json 문자열을 Object 형식으로 파싱한다
		JSONObject jsonObj = (JSONObject) obj; // Object 형식의 데이터를 JSONObject 형식으로 형변환한다.
		// System.out.println(jsonObj.get("items")); // {"writer":"ek","age":50}
		Object items = jsonObj.get("items");
		model.addAttribute("items", items);

	}


}// class
