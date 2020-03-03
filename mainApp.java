package ACP;

import java.util.HashMap;
import java.util.Scanner;

public class mainApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a or b: ");
        String selection = scanner.next();

        appController myController = new appController();
        myController.mapCommand("a", new aHandler());
        myController.mapCommand("b", new bHandler());

        HashMap selectionMap = new HashMap();
        myController.handleRequest(selection, selectionMap);

    }
}
