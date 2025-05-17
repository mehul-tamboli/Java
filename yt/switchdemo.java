import java.util.Scanner;
public class switchdemo {
  public static void main(String[] args){
    //Conditional statements -Switch
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter ur choice:");
  int day =sc.nextInt(); //1-monday,2-tuesday

  switch(day){
    case 1 :
      System.out.println("monday");
      break;
    case 2 :
      System.out.println("monday");
      break;
    default :
      System.out.println("wed - sunday");
    sc.close();

  }





  }

}
