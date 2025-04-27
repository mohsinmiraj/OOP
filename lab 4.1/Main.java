class Student {
    // Attributes
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to check pass/fail
    void checkPass() {
        if (marks >= 40) {
            System.out.println(name + " has passed.");
        } else {
            System.out.println(name + " has failed.");
        }
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating objects of Student class
        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("raifa", 35);

        // Checking pass/fail status
        student1.checkPass();
        student2.checkPass();
    }
}
