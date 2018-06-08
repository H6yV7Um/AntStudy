package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	@RequestMapping(value = "fashion-challenge")
	public String fashion_challenge() {
		return "redirect:/file/npx.md";
	}
}
