package Assignment.Function;

import Assignment.Model.StudentModel;

import java.util.Scanner;

public class StudentInfoById {
    private StudentModel model = new StudentModel();
    public void showStudentInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("You want to find student has ID = ");
        int id = scanner.nextInt();
        model.getById(id);

    }
}
