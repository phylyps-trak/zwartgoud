package com.michielsbeans.koffie.controller;

import java.util.Optional;

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
// save methode felix oud
		public Zakkie save(Zakkie zakkie){
			return zd.save(zakkie);
		}
// aan elkaar geprutst, nog geen idee wat dit doet
		public Optional<Zakkie> findById(Long id) {
			return zd.findById(id);
		}

		public Iterable <Zakkie> findAll(){
			Iterable <Zakkie> result = zd.findAll();
			return result;
		}
}
