package lab08.assignment_8_4;

import java.util.*;

public class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;

	public Address(String name, String street, String city, String state, String zip) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@SuppressWarnings("serial")
	public List<String> asList() {
		return new ArrayList<String>() {
			{
				add(name);
				add(street);
				add(city);
				add(state);
				add(zip);
			}
		};

	}
	
	public String toString1() {
		String res = name + "\n" +
					 street + "\n" +
					 city + ", " + state + " " + zip;
		return res;
	}
	
	public String toString() {
		String res = String.format("%s\n%s\n%s, %s %s", name, street, city, state, zip);
		return res;
	}

	/** Converts address fields to upper case, returns as list */
	public static List<String> toUpper(List<String> strs) {
		List<String> res = new ArrayList<>();
		strs.forEach(
			str -> res.add(str.toUpperCase())
		);
		return res;
	}

}
