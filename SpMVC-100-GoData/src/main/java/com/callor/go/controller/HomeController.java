package com.callor.go.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.callor.go.service.BisService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	
	private final BisService bisService;
	public HomeController(BisService bisService) {
		super();
		this.bisService = bisService;
	}
	
	
	@RequestMapping(value="/")
	public String home() {
		return "home";
	}

	
	
//	@ResponseBody
//	@RequestMapping(value = "/", method = RequestMethod.GET,
//				produces = "application/json;charset=UTF-8")
//	
//	public List<BisStation> home(Locale locale, Model model) {
//		List<BisStation> bisList = bisService.getStations();
//		log.debug("HOME");
//		return bisList;
//	}
	
}