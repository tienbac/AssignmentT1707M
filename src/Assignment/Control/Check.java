package Assignment.Control;

import Assignment.Emtity.Students;
import Assignment.Model.StudentModel;

import java.util.Scanner;

public class Check {
    Scanner scanner = new Scanner(System.in);
    public void checkRollNumber(){
        String rollNumber = "";
        boolean check1 = true;
        while (check1){
            System.out.println("Student Roll Number: ");
            String sRollNumber = scanner.nextLine();
            if (sRollNumber.length() >= 6 && sRollNumber != null){
                sRollNumber = rollNumber;
                break;
            }else {
                System.out.println("Student RollNumber is required!");
            }
        }
    }
}
