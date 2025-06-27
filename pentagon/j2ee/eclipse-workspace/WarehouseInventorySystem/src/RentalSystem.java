public class RentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("KA01AB1234", "Honda City", 1500, 5);
        Vehicle bike = new Bike("KA02XY5678", "Yamaha FZ", 500, true);
        

        System.out.println("=== Car Details ===");
        car.displayDetails();
        System.out.println("Total Rent for 3 days: ₹" + car.calculateRent(3));

        System.out.println("\n=== Bike Details ===");
        bike.displayDetails();
        System.out.println("Total Rent for 2 days: ₹" + bike.calculateRent(2));

        
    }
}

