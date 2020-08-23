package car_dealership;

public class Employee {

	// Employee handling customer
	public void handleCustomer(Customer customer, Vehicle vehicle, boolean finance) {

		// if customer accepts finance
		if (finance == true) {
			double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
			runCreditHistory(customer, loanAmount);
			processTransaction(vehicle, customer);
		} // if customer is not accepting finance
		else if (vehicle.getPrice() <= customer.getCashOnHand()) {
			processTransaction(vehicle, customer);
		} // if customer has less money
		else {
			System.out.println("Customer " + customer.getName() + " needs more money to purchase "
					+ vehicle.getCompany() + " " + vehicle.getModel() + " car");
		}
	}

	// to check credit score
	public void runCreditHistory(Customer customer, double loanAmount) {
		System.out.println("Running credit history....\nCustomer " + customer.getName() + "'s loan amount " + loanAmount
				+ " has been approved by the bank");
	}

	// transaction process
	public void processTransaction(Vehicle vehicle, Customer customer) {
		System.out.println("Customer " + customer.getName() + " has purchased " + vehicle.getColor() + " color "
				+ vehicle.getCompany() + " car of model " + vehicle.getModel() + " for the price of "
				+ vehicle.getPrice());
	}
}
