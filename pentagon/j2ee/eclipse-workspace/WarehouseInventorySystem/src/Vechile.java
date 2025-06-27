class Vehicle {
    String vehicleNumber;
    String model;
    double rentalRatePerDay;

    public Vehicle(String vehicleNumber, String model, double rentalRatePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Model: " + model);
        System.out.println("Rate per Day: ₹" + rentalRatePerDay);
    }

    public double calculateRent(int days) {
        return rentalRatePerDay * days;
    }
}


