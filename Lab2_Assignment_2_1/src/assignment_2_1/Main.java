package assignment_2_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<Customer>();
		
		Address billingAddress1 = new Address("streetName 1", "Chicago", "IL", "60007");
		Address shippingAddress1 = new Address("streetName 2", "Chicago", "IL", "60007");
		Customer customer1 = new Customer("firstName 1", "lastName 1", "123-45-6789", billingAddress1, shippingAddress1);
		customers.add(customer1);
		
		Address billingAddress2 = new Address("streetName 3", "FairField", "IA", "52556");
		Address shippingAddress2 = new Address("streetName 4", "FairField", "IA", "52556");
		Customer customer2 = new Customer("firstName 2", "lastName 2", "123-45-8976", billingAddress2, shippingAddress2);
		customers.add(customer2);
		
		for (Customer customer : customers) {
			if (customer.getBillingAddress().getCity().equals("Chicago")) {
				System.out.println(customer.toString());
			}
		}
	}
}
