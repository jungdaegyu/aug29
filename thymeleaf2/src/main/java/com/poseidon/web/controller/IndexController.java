package com.poseidon.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("txt", "서버에서 보낸 메세지 입니다.");
		model.addAttribute("html", "<div style=\"font-size: 20pt;\">div입니다.</div>");
		model.addAttribute("bno", 255);
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			list.add("홍길동" + i);
		}
		
		model.addAttribute("list", list);
		return "index.html";
	}
}
