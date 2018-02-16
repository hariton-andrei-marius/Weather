package api;

import java.net.URI;
import java.net.URISyntaxException;

public class OpenWeatherMap
{
	private final static String APP_ID = "2a912ba21fc02a146dcf008b3ea87010";
	
	public static URI getURI(String cityToSearch) throws URISyntaxException
	{
		String scheme = "https";
		String authority = "api.openweathermap.org";
		String path = "/data/2.5/weather";
		String query = "appid=" + APP_ID + "&q=" + cityToSearch;
		String fragment = "";
		
		return new URI(scheme, authority, path, query, fragment);
	}
}
