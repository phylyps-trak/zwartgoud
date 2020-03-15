package com.michielsbeans.koffie.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.michielsbeans.koffie.controller.ZakkieService;
import com.michielsbeans.koffie.dto.Zakkie;

@RestController
public class ZakkieEndpoints {
		
		@Autowired
		ZakkieService s;
		
		@PostMapping("/addzakkie")
		public Zakkie test(@RequestBody Zakkie zakkie) {
			System.out.println("hij doet het!!");
			s.saveZakkie(zakkie);
			return(zakkie);
		}
		@GetMapping("/bekijkzakkie")
		public Iterable<Zakkie> jojo() {
			return s.getZakkies();
		}
		
		@DeleteMapping("/deletezakkie/{id}")
		public void delete(@PathVariable String id) {
			Long zakkieId = Long.parseLong(id);
			s.verwijderZakkie(zakkieId);
			System.out.println(id + "verwijderd!");
		}
	
}
