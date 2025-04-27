interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Birds fly");
    }

    void nest() {
        System.out.println("Birds build nest");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane is flying");
    }

    void land() {
        System.out.println("Airplane is landing");
    }
}

public class Main {
    public static void main(String[] args) {
        Flyable[] f = { new Bird(), new Airplane() };
        
        for (Flyable l : f) {
            l.fly();
        }

        for (Flyable l : f) {
            if (l instanceof Bird) {
                Bird b = (Bird) l;
                b.nest();
            } else if (l instanceof Airplane) {
                Airplane a = (Airplane) l;
                a.land();
            }
        }
    }
}

