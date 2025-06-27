
	class Person {
	    String name;
	
	    Person(String name) {
	        this.name = name;
	    }
	}
	

	class MobileNotAvailableException extends Exception {
	    MobileNotAvailableException(String message) {
	        super(message);
	    }
	}
	                                           
	// Seller 
	class Seller extends Person {
	    int mobilesAvailable;
	
	    Seller(String name, int mobilesAvailable) {
	        super(name);
	        this.mobilesAvailable = mobilesAvailable;
	    }
	
	    void sellMobile(int quantity) throws MobileNotAvailableException {
	        if (quantity > mobilesAvailable) {
	            throw new MobileNotAvailableException("Not enough mobiles! Available: " + mobilesAvailable);
	        }
	        mobilesAvailable -= quantity;
	        System.out.println(name + " sold " + quantity + " mobiles.");
	    }
	}
	
	// Buyer 
	class Buyer extends Person {
	    Buyer(String name) {
	        super(name);
	    }
	
	    void buyMobile(Seller seller, int quantity) {
	        try {
	            seller.sellMobile(quantity);
	            System.out.println(name + " successfully bought " + quantity + " mobiles.");
	        } catch (MobileNotAvailableException e) {
	            System.out.println(name + " failed to buy: " + e.getMessage());
	        }
	    }
	}
	
	
	public class MobileShop {
	    public static void main(String[] args) {
	        Seller seller = new Seller("TechWorld", 3);
	        Buyer buyer1 = new Buyer("Janu");
	        Buyer buyer2 = new Buyer("Anu");
	
	        buyer1.buyMobile(seller, 4);  // Should succeed
	        buyer2.buyMobile(seller, 3);  // Should fail
	    }
	}
	
	
	