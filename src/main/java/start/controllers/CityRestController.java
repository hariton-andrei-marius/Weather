package start.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import objects.*;

@RestController
public class CityRestController {
	
	private static final String REST_API = "http://openweathermap.org/data/2.5/weather?appid=b6907d289e10d714a6e88b30761fae22&q=";
	
	@RequestMapping("/rest/city")
	public City city(Model model,
		@RequestParam(value = "name", required = false, defaultValue = "Bologna,it") String name)
	{
		RestTemplate restTemplate = new RestTemplate();
        
		City city = restTemplate.getForObject(REST_API + name, City.class);
    	
		return city;
	}

}
