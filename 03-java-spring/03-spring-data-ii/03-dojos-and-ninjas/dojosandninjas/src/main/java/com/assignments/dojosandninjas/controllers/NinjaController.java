package com.assignments.dojosandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.dojosandninjas.models.Dojo;
import com.assignments.dojosandninjas.models.Ninja;
import com.assignments.dojosandninjas.services.DojoService;
import com.assignments.dojosandninjas.services.NinjaService;

@Controller
public class NinjaController {
	
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/ninjas/new")
	public String addNinjaDisp(Model model) {
		List<Dojo> dojoList = dojoService.findAll();
		model.addAttribute("dojoList", dojoList);
		return "newninja.jsp";
	}
	
	@PostMapping("ninjas/new")
	public String addNinjaToDB(Ninja ninja) {
		ninjaService.save(ninja);
		System.out.println(ninja.toString());
		return "redirect:/";
	}
	
	
	
	

}
