import java.util.Scanner;  

class Result {   
    double num1;
    double num2;
    double num3;
    double total_num;

    Result(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    void totalResult() {  
        total_num = num1 + num2 + num3;
        System.out.println("Total: " + total_num);

        if (total_num > 80) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        
        Result ch = new Result(num1, num2, num3);
        ch.totalResult();

        scanner.close(); 
    }
}


