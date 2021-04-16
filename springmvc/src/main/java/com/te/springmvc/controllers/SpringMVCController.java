package com.te.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.te.springmvc.beans.RegisterBean;

@Controller
public class SpringMVCController {

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("homePage");
		return modelAndView;
	}

	@GetMapping("/register")
	public String name() {
		return "register";
	}

	@PostMapping("/result")
	public String getResult(HttpServletRequest request) {
		String name = request.getParameter("fname");
		request.setAttribute("username", name);
		String email = request.getParameter("email");
		request.setAttribute("email", email);
		return "result";
	}

	@PostMapping("/result1")
	public String result(ModelMap map, String fname, String email) {
		map.addAttribute("name", fname);
		map.addAttribute("email", email);
		return "result";
	}

	@PostMapping("/result2")
	public String result2(RegisterBean registerBean, ModelMap modelMap) {
		modelMap.addAttribute("name", registerBean.getFname());
		modelMap.addAttribute("email", registerBean.getEmail());
		return "result";
	}

	@PostMapping("/result3")
	public String getFromRequestParam(ModelMap modelMap, @RequestParam(name = "") String fname,
			@RequestParam(name = "") String email) {
		modelMap.addAttribute("name", fname);
		modelMap.addAttribute("email", email);
		return "result";
	}
}
