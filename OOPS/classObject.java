package OOPS;


class pen {
    //class properties
    String color;
    String type; //ballpen,gel

    public static void write (){
        System.out.println("Writing something");
    }


    public void printcolor(){
        System.out.println(this.color);
    }
}

//class name in 1st letter in capital
class Student{
    //properties
    String name;
    int age ;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    //constructor create
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}


//filename = class name
//class ke Object public class madhe create karache in Main function
public class classObject {
    public static void main(String[] args) {

        // pen pen2 = new pen();
        // pen2.color = "Black";
        // pen2.type = "ballpoint";

        // pen pen1 = new pen();
        // pen1.color = "green";
        // pen1.type = "gel";

        

        // // pen1.write();

        // pen1.printcolor();//blue
        // pen2.printcolor();//black






        //2. Student Class
        // Student s1 = new Student();
        // s1.name = "Mehul";
        // s1.age = 22;

        // //call function-> obj using method
        // s1.printInfo();





        //3.for Constructor 
        Student s1 = new Student( "Mehul", 22);
        Student s2 = new Student( "OM", 25);
        s1.printInfo();
        s2.printInfo();

    }
}
