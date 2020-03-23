package com.michielsbeans.koffie.controller;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import com.michielsbeans.koffie.dto.Brander;

	@Component
	public interface BranderDao extends CrudRepository<Brander, Long>{
		
		List<Brander> findByBranderStadIgnoreCase(String stad);
		
		@Query(value = "SELECT * FROM BRANDER WHERE BRANDER_STAD = ?1", nativeQuery = true)
		List<Brander> findByStad(String stad);

}

