package car_dealership;

public class Customer {
	private String name;
	private String address;
	private int cashOnHand;
	
	public Customer(String name, String address, int cashOnHand) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(int cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	public void purchaseCar(Vehicle vehicle,Employee employee, boolean finance) {
		employee.handleCustomer(this,vehicle,finance);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", cashOnHand=" + cashOnHand + "]";
	}
	
	
}

