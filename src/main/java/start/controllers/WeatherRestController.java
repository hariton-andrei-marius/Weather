package start.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import objects.*;

@RestController
public class WeatherRestController {
	
	private static final String REST_API = "http://openweathermap.org/data/2.5/weather?appid=b6907d289e10d714a6e88b30761fae22&q=";
	
	@RequestMapping("/rest/weather")
	public Weather weather(Model model,
		@RequestParam(value = "city", required = false, defaultValue = "Bologna,it") String city)
	{
		RestTemplate restTemplate = new RestTemplate();
        
		Weather weather = restTemplate.getForObject(REST_API + city, Weather.class);
    	
		return weather;
	}

}
