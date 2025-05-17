import java.util.*;

public class miniproject {
    public static void main(String[] args) {
         //Mini project
        Scanner sc = new Scanner(System.in);
        
        int myNumber =(int)(Math.random()*100);
        int userName = 0;
        do{
            System.out.println("Guess my Number (1-100)");
            userName = sc.nextInt();

            if(userName == myNumber){
                System.out.println("WOOHOO ......CORRECT nUMBER");
                break;
            }
            else if(userName > myNumber){
                System.out.println("your number is large.");
            }
            else
            {
                System.out.println("your number is too small.");
            }
            

        }while(userName >= 0);

    System.out.println("Mynumber is " + myNumber);


sc.close();



    }
}
