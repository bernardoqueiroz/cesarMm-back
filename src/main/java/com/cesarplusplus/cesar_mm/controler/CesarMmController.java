package com.cesarplusplus.cesar_mm.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class CesarMmController {
	@RequestMapping
	public String homepage() {
		return "Esta é a homepage!";
	}
}
