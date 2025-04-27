import java.util.Scanner;

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of persons
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Creating an array of Person objects
        Person[] persons = new Person[n];

        // Taking input for each person
        for (int i = 1; i < n; i++) {
            System.out.print("Enter name of person " + (i +  ": "));
            String name = scanner.nextLine();

            System.out.print("Enter age of person " + (i + ": "));
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Creating and storing object in array
            persons[i] = new Person(name, age);
        }

        System.out.println("\nList of Persons:");
        // Displaying the stored data
        for (int i = 1; i < n; i++) {
            persons[i].display();
        }

        scanner.close();
    }
}
