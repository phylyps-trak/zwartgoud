package com.michielsbeans.koffie.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.michielsbeans.koffie.controller.BranderService;
import com.michielsbeans.koffie.dto.Brander;

@RestController
public class BranderEndpoints {
	@Autowired
	BranderService b;
	
	
	@GetMapping("/branders/{stad}")
	public Iterable<Brander>vindBranders(@PathVariable(value = "stad") String stad) {
		return b.vindBranders(stad);	
	}
	
	@PostMapping("/brander")
	public String opslaan(@RequestBody Brander brander) {
		System.out.println("hij doet het!!");
		b.saveBrander(brander);
		return(" Deze brander");
	}
	@GetMapping("/brander")
	public Iterable<Brander> jojo() {
		return b.getBranders();
	}
	
	@DeleteMapping("/brander/{id}")
	public String delete(@PathVariable String id) {
		Long branderId = Long.parseLong(id);
		b.verwijderBrander(branderId);
		System.out.println(id + "verwijderd!");
		return("Deze brander is verwijderd uit de database!");
	}
}
