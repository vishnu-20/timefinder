package com.timeFinder.timeFinderapi.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timeFinder.timeFinderapi.dto.CountryDTO;
import com.timeFinder.timeFinderapi.service.CountryTimeFinderService;

@RestController
public class CountryTimeFinderController {
	
	@Autowired
	CountryTimeFinderService countryTimeFinderService;
	
	@GetMapping("/findTime")
    public ResponseEntity<CountryDTO> getCountryTime(@RequestParam String countryName) {
		return new ResponseEntity<CountryDTO>(countryTimeFinderService
				.getCountryTime(countryName),HttpStatus.OK);
       
    }

}
