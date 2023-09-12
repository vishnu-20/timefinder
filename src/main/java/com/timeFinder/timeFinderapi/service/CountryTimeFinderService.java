package com.timeFinder.timeFinderapi.service;

import com.timeFinder.timeFinderapi.dto.CountryDTO;

public interface CountryTimeFinderService {
	
	public CountryDTO getCountryTime(String countryName);

}
