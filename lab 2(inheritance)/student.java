//parent class
public class student {
    int roll;
    String name;
}

// child class 
class result extends student{
    float mark ;
    void getdata(){

        roll=101;
        name="abc";
        mark=75.5f;
    }
     void display(){
        System.out.println("name is"+name);
        System.out.println("name is"+mark);
        System.out.println("name is"+roll);
     }
    }
    public static void main(String[]args){
        result r =new result();
        r.getdata();
        r.display();
    }