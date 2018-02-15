package objects;

import java.util.Collection;
import java.util.LinkedList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Countries {

	public String name;
    private Collection<Country> countries;

    public Countries() {
    	countries = new LinkedList<>();
    }

    public Collection<Country> getCountries() {
        return countries;
    }

    public void setCountries(Collection<Country> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return countries.toString();
    }
}