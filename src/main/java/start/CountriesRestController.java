package start;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import objects.*;

@RestController
public class CountriesRestController {
	
	private static final String REST_API = "http://openweathermap.org/data/2.5/weather?appid=b6907d289e10d714a6e88b30761fae22&q=Bologna,it";
	
    @RequestMapping("/rest/countries")
    public Countries countries(Model model) {
    	
    	RestTemplate restTemplate = new RestTemplate();
        
        Countries countries = restTemplate.getForObject(REST_API, Countries.class);
    	
        return countries;
    }

}
