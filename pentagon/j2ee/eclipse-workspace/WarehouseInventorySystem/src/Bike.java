class Bike extends Vehicle {
    boolean hasGear;

    public Bike(String vehicleNumber, String model, double rentalRatePerDay, boolean hasGear) {
        super(vehicleNumber, model, rentalRatePerDay);
        this.hasGear = hasGear;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
    }
}

