package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "Header")
public class HeaderController {
	@RequestMapping(value = "requestHeader", produces = "application/json; charset=utf-8",method=RequestMethod.POST)
	@ResponseBody
	public String requestHeader(@RequestHeader String key,@RequestParam String name) {
		System.out.println(name);
		return key;
	}
}
