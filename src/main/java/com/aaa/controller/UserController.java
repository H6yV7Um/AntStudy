package com.aaa.controller;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aaa.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	@Value("#{myconfig.TEMPORARY_STORE_DIR}")
	private String store_dir;
	
	@Resource
	private UserService userService;

	@RequestMapping("openPage/{dest}/")
	public String openPage(@PathVariable String dest) {
		System.out.println(store_dir);
		return dest;
	}

	@PostMapping(value = "Add/")
	public String addUser(@RequestParam String username, @RequestParam String password, Model model) {
		String id = "";
		id = userService.addUser(username, password);
		model.addAttribute("message", id);
		return "message";
	}

	@RequestMapping("List/{dest}/")
	public String userList(@PathVariable String dest, Model model) {
		model.addAttribute("userList", userService.getUserList());
		return dest;
	}
}
