package start.controllers;

import java.net.URISyntaxException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import start.modules.RestApi;

@RestController
public class CityDetailsRestController {
	
	@RequestMapping("/rest/city_details")
	public Object cityDetails(Model model,

		@RequestParam(value = "city", required = false, defaultValue = "Bologna") String city)
	{
		RestTemplate restTemplate = new RestTemplate();
		
		Object cityDetails = new Object();
		
		try
		{
			cityDetails = restTemplate.getForObject(RestApi.getCityDetailsURI(city), Object.class);
		}
		catch (RestClientException | URISyntaxException e)
		{
			e.printStackTrace();
		}
    	
		return cityDetails;
	}

}