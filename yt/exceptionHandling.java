import java.util.Scanner;
public class exceptionHandling {
    public static void main(String[] args) {
        
        //TRY-CATCH on Exception handling
        int[] marks ={97,98,95};
        
        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
            //do something after catching
        }
        System.out.println("The name is Mehul");
    }
}
