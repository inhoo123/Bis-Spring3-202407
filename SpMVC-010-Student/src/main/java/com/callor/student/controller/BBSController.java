package com.callor.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BBSController {
	@RequestMapping(value = "/bbs/notice", method = RequestMethod.GET)
	public String notice() {
		return null;
	}

	@RequestMapping(value = "/bbs/home", method = RequestMethod.GET)
	public String home() {
		return null;
	}

}
