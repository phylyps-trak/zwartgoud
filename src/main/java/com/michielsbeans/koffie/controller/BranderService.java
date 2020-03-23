package com.michielsbeans.koffie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.michielsbeans.koffie.dto.Brander;

@Service
@Transactional
public class BranderService {
		
		@Autowired
		BranderDao bd;
		
		//METODE MET DERIVER QUERY
		public List<Brander>vindBrandersDerivedQuery (String stad) {
			List<Brander> dezeBranders = bd.findByBranderStadIgnoreCase(stad);
			return dezeBranders;
		}
		
		//METHODE MET @QUERY
		public List<Brander>vindBrandersAtQuery (String stad) {
			List<Brander> dezeBranders = bd.findByStad(stad);
			return dezeBranders;
		}
		
//save methode nieuw
		public void saveBrander(Brander b) {
			System.out.println("Brander save service method... Go!");
			bd.save(b);
		}
		
// bekijk alle Brander methode
		public Iterable<Brander> getBranders() {
			Iterable<Brander> branders;
			branders = bd.findAll();
			return branders;
		}
		
// verwijder Brander methode
		public void verwijderBrander(Long userId) {
			System.out.println("Zakkie verwijderd uit Database");
			bd.deleteById(userId);
		}
}
