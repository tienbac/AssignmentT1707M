package Assignment.Main;

import Assignment.Control.Menu;
import Assignment.Model.CloseConnectionHelper;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            CloseConnectionHelper closeConnectionHelper = new CloseConnectionHelper();
            Menu menu = new Menu();
            menu.menu();
            System.out.println("                        ");
            System.out.println("Do you want to continue?");
            System.out.println("<====================>");
            System.out.println("||      0 : NO      ||");
            System.out.println("||      1 : YES     ||");
            System.out.println("<====================>");
            System.out.print("YOUR ACTION IS: ");
            int ans = scanner.nextInt();
            scanner.nextLine();
            if (ans==1){
                System.out.println("                   ");
                continue;
            }else if (ans==0){
                closeConnectionHelper.closeConnection();
                System.out.println("GOOD BYE! SEE YOU NEXT TIME!");
                System.exit(0);
                break;
            }else {
                System.out.println("Please choice 1: yes or 0: no!");
                break;
            }
        }
    }
}
