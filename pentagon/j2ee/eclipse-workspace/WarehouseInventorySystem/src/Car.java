class Car extends Vehicle {
    int numberOfSeats;

    public Car(String vehicleNumber, String model, double rentalRatePerDay, int numberOfSeats) {
        super(vehicleNumber, model, rentalRatePerDay);
        this.numberOfSeats = numberOfSeats;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + numberOfSeats);
    }
}

		