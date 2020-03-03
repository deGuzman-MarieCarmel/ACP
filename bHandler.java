package ACP;

import java.util.HashMap;
import java.util.Scanner;

public class bHandler implements Handler{

    @Override
    public void handleIt(HashMap<String, Object> data){
        try{
            System.out.println("You selected B.\n\n" + "This option concatenates two strings.");
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter your first name: ");
            String firstStr = reader.nextLine();
            System.out.println("Enter your last name: ");
            String secondStr = reader.nextLine();
            String concatResult = secondStr + ", " + firstStr;
            System.out.println("\nThe concatenation result is: " + concatResult);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
