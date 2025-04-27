public class Casting {
    public static void main(String[] args) {
        Person A = new Student();
        A.display();
        Student s = (Student) A;
        s.study();
    }
}

class Person {
    void display() {
        System.out.println("It is person class");
    }
}

class Student extends Person {
    void study() {
        System.out.println("students don't study");
    }
}



