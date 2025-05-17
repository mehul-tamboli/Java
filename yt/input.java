import java.util.*;
// import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        //input in java
        Scanner sc = new Scanner(System.in);//object name is sc
        System.out.println("Input Your Age: ");
        int age = sc.nextInt();
        System.out.println("Input Your : ");
        float num = sc.nextFloat();
        System.out.println("your age is :"+ age + " and Number is :"+ num);
        //string input 
        System.out.println("Enter your name :");
        String nameF = sc.nextLine();

        sc.close();
    }
}
