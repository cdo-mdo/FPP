package lab02.assignment_2_1;

/**
 * Class Customer with information of first name, last name, social security number, billing address and shipping address
 */
public class Customer {

	Customer(String firstName, String lastName, String socSecurityNumber, Address billingAddress,
			Address shippingAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNumber = socSecurityNumber;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
	}

	public String toString() {
		StringBuffer res = new StringBuffer();
		res.append("[");
		res.append(this.firstName); res.append(", ");
		res.append(this.lastName);  res.append(", ");
		res.append("ssn: "); res.append(this.socSecurityNumber);
		res.append("]");
		
		return res.toString();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocSecurityNumber() {
		return socSecurityNumber;
	}

	public void setSocSecurityNumber(String socSecurityNumber) {
		this.socSecurityNumber = socSecurityNumber;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	private String firstName;
	private String lastName;
	private String socSecurityNumber;
	private Address billingAddress;
	private Address shippingAddress;

}
