package com.example.Urlcount.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.Urlcount.model.Visit;
@Service
public class UrlService {
	
	static Map<String,Integer> map = new HashMap<>();

	public Visit getVisits(String username) {
		int count = map.getOrDefault(username, 0)+1;
		map.put(username, count);
		Visit visit = new Visit(count,username);
		return visit;
	}
  
}
