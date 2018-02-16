package objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather
{
	private int id, cod, visibility, dt;
	private String name, base;
	private Object weather, main, coord, wind, clouds, sys;
	
	public int getId()
	{
		return id;
	}
	
	public int getCod()
	{
		return cod;
	}
	
	public int getVisibility()
	{
		return visibility;
	}
	
	public int getDt()
	{
		return dt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getBase()
	{
		return base;
	}
	
	public Object getWeather()
	{
		return weather;
	}
	
	public Object getMain()
	{
		return main;
	}
	
	public Object getCoord()
	{
		return coord;
	}
	
	public Object getWind()
	{
		return wind;
	}
	
	public Object getClouds()
	{
		return clouds;
	}
	
	public Object getSys()
	{
		return sys;
	}
}