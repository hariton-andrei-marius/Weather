package objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {

	public int id, cod, visibility;
	public String name, base;
	
	public City()
	{}
}