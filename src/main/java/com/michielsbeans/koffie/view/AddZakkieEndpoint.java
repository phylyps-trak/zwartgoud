package com.michielsbeans.koffie.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.michielsbeans.koffie.controller.ZakkieService;
import com.michielsbeans.koffie.dto.Zakkie;


@RestController
public class AddZakkieEndpoint {
		
		@Autowired
		ZakkieService s;
		
		@PostMapping("/addzakkie")
		public Zakkie test(@RequestBody Zakkie zakkie) {
			System.out.println("hij doet het!!");
			s.saveZakkie(zakkie);
			return(zakkie);
		}
	
}
