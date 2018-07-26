package com.bidforyou.bidit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class initController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "test";
	}

}
