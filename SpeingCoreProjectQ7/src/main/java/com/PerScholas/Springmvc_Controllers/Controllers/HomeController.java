package com.PerScholas.Springmvc_Controllers.Controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private SimpleDateFormat sdf;
	private Date dt;

	@GetMapping(value = "/", produces = "text/html")
	public String sendText() {
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		dt = new Date();
		return "<h1>Hello There! Today's date is: "+ sdf.format(dt) + "</h1>";
	}
}
