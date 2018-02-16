package extern;

import java.net.URI;
import java.net.URISyntaxException;

public class RestApi
{
	private final static String GLOBAL_SCHEME = "https";

	private final static String WEATHER_APP_ID = "2a912ba21fc02a146dcf008b3ea87010";
	private final static String WEATHER_AUTHORITY = "api.openweathermap.org";
	private final static String WEATHER_PATH = "/data/2.5/weather";
	private final static String WEATHER_QUERY = "appid=" + WEATHER_APP_ID + "&q=";

	private final static String CITY_DETAILS_AUTHORITY = "api.teleport.org";
	private final static String CITY_DETAILS_PATH = "/api/cities";
	private final static String CITY_DETAILS_QUERY = "search=";

	public static URI getWeatherURI(String cityToSearch) throws URISyntaxException
	{
		return new URI(
				GLOBAL_SCHEME,
				WEATHER_AUTHORITY,
				WEATHER_PATH,
				WEATHER_QUERY + cityToSearch,
				""
		);
	}

	public static URI getCityDetailsURI(String cityToSearch) throws URISyntaxException
	{
		return new URI(
				GLOBAL_SCHEME,
				CITY_DETAILS_AUTHORITY,
				CITY_DETAILS_PATH,
				CITY_DETAILS_QUERY + cityToSearch,
				""
		);
	}
}
