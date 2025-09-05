package in.com.java8;

interface Vtu {
    double fee = 49999.99;  // public static final by default
    
    void fee();  // public abstract by default
}

class GECHH implements Vtu {
    @Override
    public void fee() {
        System.out.println("Fee: " + fee);
    }

    void add() {
        System.out.println("Java");
    }
}

public class Priynka {
    public static void main(String[] args) {
        
        // Vtu v1 = new Vtu(); ❌ Not allowed (cannot create object of interface)
        
        Vtu v = new GECHH();   // ✅ upcasting
        v.fee();
        
        GECHH g = new GECHH(); // ✅ direct object
        g.fee();
        g.add();
        
        // v.add(); ❌ not allowed because v is reference of type Vtu
        
        ((GECHH) v).add(); // ✅ downcasting to call subclass-specific method
    }
}
