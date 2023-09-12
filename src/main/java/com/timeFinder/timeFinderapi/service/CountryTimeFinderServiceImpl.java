package com.timeFinder.timeFinderapi.service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import com.timeFinder.timeFinderapi.dto.CountryDTO;

@Service 
public class CountryTimeFinderServiceImpl implements CountryTimeFinderService{

	@Override
	public CountryDTO getCountryTime(String countryName) {
		CountryDTO countryDTO = new CountryDTO();
		 try {
	            ZoneId zoneId = ZoneId.of(countryName); 
	            ZonedDateTime currentTime = ZonedDateTime.now(zoneId);
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

	            countryDTO.setValString(currentTime.format(formatter)); 
	        } catch (Exception e) {
	            countryDTO.setValString("Invalid country name or time zone not found."); 
	        }
		 return countryDTO;
	}

}
