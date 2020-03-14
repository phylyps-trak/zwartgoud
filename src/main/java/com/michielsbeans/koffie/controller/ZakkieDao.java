package com.michielsbeans.koffie.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import com.michielsbeans.koffie.dto.Zakkie;

	@Component
	public interface ZakkieDao extends CrudRepository<Zakkie, Long>{

}

