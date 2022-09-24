package com.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewPostController {

	@RequestMapping("/new-post")
	public String newPost() {
		
		return "create-new-post";
	}
}
