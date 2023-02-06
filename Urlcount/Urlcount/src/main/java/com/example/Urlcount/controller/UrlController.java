package com.example.Urlcount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Urlcount.model.Visit;
import com.example.Urlcount.service.UrlService;

@RestController
@RequestMapping("/api/v1/Vistors-count")
public class UrlController {

@Autowired
private UrlService urlService;

@GetMapping("/username/{username}/count")
	public Visit getCount(@PathVariable String username) {
	return urlService.getVisits(username);
}
}
