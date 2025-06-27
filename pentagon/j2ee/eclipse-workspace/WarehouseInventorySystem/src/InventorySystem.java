import java.util.Scanner;

class Item {
    String name;
    double price;

    static double totalValue = 0;
    static double taxRate;

    // Static block to set default tax rate
    static {
        taxRate = 0.18; // 18% GST
    }

    // Constructor to create new item and update total
    Item(String name, double price) {
        this.name = name;
        this.price = price;
        totalValue += price;
    }

    // Static method to calculate total with tax
    public static double computeTotalWithTax() {
        return totalValue + (totalValue * taxRate);
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nItem " + i);
            System.out.print("Enter item name: ");
            sc.nextLine(); // clear buffer
            String name = sc.nextLine();
            System.out.print("Enter item price: ");
            double price = sc.nextDouble();

            new Item(name, price);
        }

        System.out.println("\nTotal Value (excluding tax): ₹" + Item.totalValue);
        System.out.println("Total Value (including tax): ₹" + Item.computeTotalWithTax());

        sc.close();
    }
}
