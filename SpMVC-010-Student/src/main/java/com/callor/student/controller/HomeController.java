package com.callor.student.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.student.models.StudentVO;
import com.callor.student.persistance.StudentDao;

@Controller
public class HomeController {

	private final StudentDao studentDao;

	public HomeController(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	// http://localhost:8080/student/ 로 request 가 오면
	// http://localhost:8080/student 로 request 가 오면
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<StudentVO> stList = studentDao.selectAll();

		model.addAttribute("ST_LIST", stList);
		return "home";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		return "student/input";
	}

	// 학생정보를 입력받기 위한 화면을 보여주는 method
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(StudentVO studentVO, Model model) {
		model.addAttribute("STD", studentVO);

		int result = studentDao.insert(studentVO);
//		List<StudentVO> stList = studentDao.selectAll();
//		model.addAttribute("ST_LIST", stList);
//		return "home";
		return "redirect:/";
	}

}
