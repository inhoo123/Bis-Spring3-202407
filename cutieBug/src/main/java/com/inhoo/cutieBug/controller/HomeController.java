 package com.inhoo.cutieBug.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.inhoo.cutieBug.model.CutieBug;
import com.inhoo.cutieBug.model.CutieBugList;
import com.inhoo.cutieBug.service.CutieBugService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class HomeController {

	private final CutieBugService cutieBugService;

	public HomeController(CutieBugService cutieBugService) {
		super();
		this.cutieBugService = cutieBugService;
	}

	@RequestMapping(value = "/")
	public String home(@RequestParam(name="systemkorname",required = false,defaultValue = "")String systemkorname,Model model) {
		
		List<CutieBug> cutieBugList = cutieBugService.getBugNames(systemkorname);
		model.addAttribute("CUTIE_BUG_LIST",cutieBugList);
		
		return "home";
	}
}
