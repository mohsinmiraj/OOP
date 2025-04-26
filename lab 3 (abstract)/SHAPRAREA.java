// Abstract class representing shape area
public abstract class SHAPRAREA {
    // Abstract method to calculate area
    abstract void area();
}

// Triangle class extending ShapeArea
class Triangle extends SHAPRAREA{
    @Override
    void area() {
        double x = 2.0;
        double y = 3.0;
        double a = 0.5 * (x * y);
        System.out.println("Triangle Area: " + a);
    }
}

// Rectangle class extending ShapeArea
class Rectangle extends SHAPRAREA {
    @Override
    void area() {
        int x = 2;
        int y = 3;
        int a = x * y;
        System.out.println("Rectangle Area: " + a);
    }

    // Main method to test functionality
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();

        Rectangle r1 = new Rectangle();
        r1.area();
    }
}

  
  