package com.michielsbeans.koffie.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import com.michielsbeans.koffie.dto.Brander;

	@Component
	public interface BranderDao extends CrudRepository<Brander, Long>{

}

