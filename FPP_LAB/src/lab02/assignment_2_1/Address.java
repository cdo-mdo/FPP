package lab02.assignment_2_1;

/**
 * Class address with information of street address, city, state and zip code
 */
public class Address {

	Address(String street, String city, String state, String zip) {
		this.streetAdress = street;
		this.city = city;
		this.state = state;
		this.zipCode = zip;
	}

	public String getStreetAdress() {
		return streetAdress;
	}

	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	private String streetAdress;
	private String city;
	private String state;
	private String zipCode;
}
