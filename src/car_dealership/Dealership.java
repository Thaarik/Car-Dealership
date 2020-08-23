package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Thaarik","123 blah blah",200000);
		Vehicle vehicle1 = new Vehicle("Hyundai","Xcentra","black",1000000);
		Employee emp = new Employee();
		
		//purchaseCar() from customer class for the cutomer to buy a car
		customer1.purchaseCar(vehicle1, emp, false);
		
		Vehicle vehicle2 = new Vehicle("Hyundai","Xcentra","black",1000000);
		
		//Usage of equals() in vehicles.
		boolean value = vehicle1.equals(vehicle2);
		System.out.println(value);

	}

}
