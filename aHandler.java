package ACP;

import java.util.HashMap;
import java.util.Scanner;

public class aHandler implements Handler{

    @Override
    public void handleIt(HashMap<String, Object> data){
        try{
            System.out.println("You selected A.\n" + "This option calculates the sum of two numbers.\n");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number: ");
            Integer firstNum = scanner.nextInt();
            System.out.println("Enter second number: ");
            Integer secondNum = scanner.nextInt();
            Integer sumResult = firstNum + secondNum;
            System.out.println("\nThe sum is: " + sumResult);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
