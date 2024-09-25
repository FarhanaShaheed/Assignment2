
import java.util.ArrayList;
import java.util.List;

public class TaskA {
	public static void main(String args[]) {
		
		List<Car> listOfCars = new ArrayList<>();
		// Adding car objects to the list
//		(String make, String model, int manufactureYr, String color, double price, String regNumber)
		
		listOfCars.add(new Car("Nissan", "Altima", 2002, "Blue", 25000, "AB123CD"));
		listOfCars.add(new Car("Mazda", "3", 2003, "Green", 30000, "EF456GH"));
		listOfCars.add(new Car("Subaru", "Outback", 2001, "White", 15000, "IJ789KL"));
		listOfCars.add(new Car("Jeep", "Wrangler", 2005, "Yellow", 40000, "MN012OP"));
		listOfCars.add(new Car("Hyundai", "Elantra", 2004, "Purple", 35000, "QR345ST"));
		listOfCars.add(new Car("Jeep", "Sorento", 2007, "Red", 50000, "UV678WX"));
		listOfCars.add(new Car("Volkswagen", "Jetta", 2006, "Silver", 45000, "YZ901AB"));
		listOfCars.add(new Car("BMW", "X5", 2001, "Black", 55000, "CD234EF"));
		listOfCars.add(new Car("Audi", "A4", 2009, "Gray", 60000, "GH567IJ"));
		listOfCars.add(new Car("Mercedes-Benz", "C-Class", 2010, "Brown", 70000, "KL890MN"));
		
		logCars(listOfCars);
		
	}
	
	public static void logCars(List<Car> list) {
		for (Car car : list) {
			System.out.println(car.getMake() + " " + car.getModel());
		}
	}
}
