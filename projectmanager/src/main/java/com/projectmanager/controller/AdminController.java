package com.projectmanager.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("admin")
public class AdminController {
	
	@GetMapping("/address")
	protected String getAddresses(HttpServletRequest reques)
	{
		String remoteAddress = reques.getRemoteAddr();
		return remoteAddress;
	}

}
