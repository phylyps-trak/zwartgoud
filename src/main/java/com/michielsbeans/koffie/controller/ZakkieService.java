package com.michielsbeans.koffie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.michielsbeans.koffie.dto.Zakkie;

@Service
@Transactional
public class ZakkieService {
		
		@Autowired
		ZakkieDao zd;
		
//save methode nieuw
		public void saveZakkie(Zakkie z) {
			System.out.println("Zakkie save service method... Go!");
			zd.save(z);
		}
// bekijk alle zakkies methode
		public Iterable<Zakkie> getZakkies() {
			Iterable<Zakkie> zakkies;
			zakkies = zd.findAll();
			return zakkies;
		}
		
// verwijder zakkie methode
		public void verwijderZakkie(Long userId) {
			System.out.println("Zakkie verwijderd uit Database");
			zd.deleteById(userId);
		}
}
