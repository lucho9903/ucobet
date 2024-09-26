package co.edu.uco.ucobet.generales.domain.city;

import java.util.UUID;

import co.edu.uco.ucobet.generales.domain.Domain;
import co.edu.uco.ucobet.generales.domain.country.CountryDomain;
import co.edu.uco.ucobet.generales.domain.state.StateDomain;

public class CityDomain extends Domain{
	private String name;
	private CountryDomain country;
	
	private CityDomain(final UUID id, final String name, final StateDomain country) {
		super(id);
		setName(name);
		
		
	}
	
	public static final CityDomain create(final UUID id, final String name, final StateDomain state) {
		return new CityDomain(id, name, state);
	}
	public String getName() {
		return name;
		
		
	}
	private final void setName(final String name) {
		this.name = name;
	}
	public CountryDomain getCountry() {
		return country;
	}
	private final void setCountry(final CountryDomain country) {
		this.country = country;
	}
	
	

}
