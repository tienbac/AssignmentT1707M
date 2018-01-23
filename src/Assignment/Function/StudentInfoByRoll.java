package Assignment.Function;

import Assignment.Model.StudentModel;

import java.util.Scanner;

public class StudentInfoByRoll {
    private StudentModel model = new StudentModel();
    public void showStudentByRoll(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("You want to find student has roll number = ");
        String rollNumber = scanner.nextLine();
        model.getByRollNumber(rollNumber);
    }
}
