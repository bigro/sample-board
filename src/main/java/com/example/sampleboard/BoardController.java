package com.example.sampleboard;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

	private BoartdService boartdService;

	public BoardController(BoartdService boartdService) {
		this.boartdService = boartdService;
	}

	@GetMapping
	public String show(Model model) {
		List<String> messages =  boartdService.find();
		model.addAttribute("messages", messages);
		return "board";
	}

	@PostMapping
	public String post(
			@RequestParam String message) {
		boartdService.post(message);
		return "redirect:/";
	}
}
