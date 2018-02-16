package start.controllers;

import java.net.URISyntaxException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import api.OpenWeatherMap;
import objects.*;

@RestController
public class WeatherRestController {
	
	@RequestMapping("/rest/weather")
	public Weather weather(Model model,
		@RequestParam(value = "city", required = false, defaultValue = "Bologna,it") String city)
	{
		RestTemplate restTemplate = new RestTemplate();
        
		Weather weather = new Weather();
		
		try
		{
			weather = restTemplate.getForObject(OpenWeatherMap.getURI(city).toString(), Weather.class);
		}
		catch (RestClientException | URISyntaxException e)
		{
			e.printStackTrace();
		}
    	
		return weather;
	}

}
