package com.zunda.hellogithub;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {

		return "<h1>Hello GitHub World!!</h1>";
	}

}
