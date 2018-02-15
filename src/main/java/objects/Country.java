package objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

    public String name;

    public Country() {
    	name = "";
    }

    public Country(String name, String capital) {
    	setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country {" +
                "name=" + name + '\'' +
                '}';
    }
}