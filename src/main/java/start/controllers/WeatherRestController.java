package start.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import objects.*;

@RestController
public class WeatherRestController {
	
	private static final String REST_API = "http://api.openweathermap.org/data/2.5/weather?appid=2a912ba21fc02a146dcf008b3ea87010&q=";
	
	@RequestMapping("/rest/weather")
	public Weather weather(Model model,
		@RequestParam(value = "city", required = false, defaultValue = "Bologna,it") String city)
	{
		RestTemplate restTemplate = new RestTemplate();
        
		Weather weather = restTemplate.getForObject(REST_API + city, Weather.class);
    	
		return weather;
	}

}
