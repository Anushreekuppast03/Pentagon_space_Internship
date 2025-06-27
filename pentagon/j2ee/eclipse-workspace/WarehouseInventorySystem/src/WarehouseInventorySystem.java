class Product {
    String name;
    double price;
    static double totalValue = 0;
    static double taxRate;

    // Static block to initialize taxRate
    static {
        taxRate = 0.18; // 18% tax
    }

    // Constructor
    Product(String name, double price) {
        this.name = name;
        this.price = price;
        totalValue += price;
    }

    // Static method to compute total value including tax
    static double getTotalValueWithTax() {
        return totalValue + (totalValue * taxRate);
    }
}





public class WarehouseInventorySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Product p1 = new Product("Laptop", 50000);
	        Product p2 = new Product("Phone", 20000);
	        Product p3 = new Product("Tablet", 15000);

	        System.out.println("Total Value (excluding tax): " + Product.totalValue);
	        System.out.println("Total Value (including tax): " + Product.getTotalValueWithTax());
	}

}
