package start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import objects.*;

@Controller
public class CountriesController {

	private static final String REST_API = "http://openweathermap.org/data/2.5/weather?appid=b6907d289e10d714a6e88b30761fae22&q=";
	
    @RequestMapping("/city")
    public String countries(@RequestParam(value = "city", required = false, defaultValue = "Bologna") String city,
    		Model model) {
    	
        RestTemplate restTemplate = new RestTemplate();
        
        Countries countries = restTemplate.getForObject(REST_API + city, Countries.class);
        
        model.addAttribute("city", countries);
        
        return "countries";
    }

}