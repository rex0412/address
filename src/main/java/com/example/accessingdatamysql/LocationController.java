package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class LocationController {
	@Autowired
	private LocationRepository locationRepository;
	
	@GetMapping(path="/locations")
	public @ResponseBody Iterable<Locations> getAllLocations() {
		return locationRepository.findAll();
	}

}
