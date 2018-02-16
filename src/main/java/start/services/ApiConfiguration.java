package start.services;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

@Configuration
@PropertySource("classpath:config.properties")
@ConfigurationProperties(prefix = "api")
@Validated
public class ApiConfiguration {

    @NotBlank
    private static String globalScheme, weatherAppID,
    	weatherAuthority, weatherPath, weatherQuery,
    	cityDetailsAuthority, cityDetailsPath, cityDetailsQuery;

    public static String getGlobalScheme() {
        return globalScheme;
    }
    
    public static String getWeatherAppID()
	{
		return weatherAppID;
	}
    
    public static String getWeatherAuthority()
	{
		return weatherAuthority;
	}
    
    public static String getWeatherPath()
	{
		return weatherPath;
	}
    
    public static String getWeatherQuery()
	{
		return weatherQuery;
	}
    
    public static String getCityDetailsAuthority()
	{
		return cityDetailsAuthority;
	}

    public static String getCityDetailsPath()
	{
		return cityDetailsPath;
	}
    
    public static String getCityDetailsQuery()
	{
		return cityDetailsQuery;
	}
    
    public static void setGlobalScheme(String globalScheme)
	{
		ApiConfiguration.globalScheme = globalScheme;
	}
    
    public static void setWeatherAppID(String weatherAppID)
	{
		ApiConfiguration.weatherAppID = weatherAppID;
	}
    
    public static void setWeatherAuthority(String weatherAuthority)
	{
		ApiConfiguration.weatherAuthority = weatherAuthority;
	}
    
    public static void setWeatherPath(String weatherPath)
	{
		ApiConfiguration.weatherPath = weatherPath;
	}
    
    public static void setWeatherQuery(String weatherQuery)
	{
		ApiConfiguration.weatherQuery = weatherQuery;
	}
    
    public static void setCityDetailsAuthority(String cityDetailsAuthority)
	{
		ApiConfiguration.cityDetailsAuthority = cityDetailsAuthority;
	}
    
    public static void setCityDetailsPath(String cityDetailsPath)
	{
		ApiConfiguration.cityDetailsPath = cityDetailsPath;
	}
    
    public static void setCityDetailsQuery(String cityDetailsQuery)
	{
		ApiConfiguration.cityDetailsQuery = cityDetailsQuery;
	}
}
