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

		public void saveZakkie(Zakkie z) {
			System.out.println("Zakkie save service method... Go!");
			zd.save(z);
		}
}
