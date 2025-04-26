public interface SHapearea { 
        public void area();
}
    
     class triangle implements SHapearea{

        public void area() {
            double x = 2.0f;
            double y = 3.0f;
            double a = 0.5 * (x * y);
            System.out.println(a);
        }
    }

    
      class rectangle implements SHapearea {
        public void area() {
            int x = 2;
            int y = 3;
            int a = x * y;
            System.out.println(a);
        }
    }
    
    class Main {
        public static void main(String[] args) {
            triangle t1 = new triangle();
            t1.area();
    
            rectangle r1 = new rectangle();
            r1.area();
        }
    }

