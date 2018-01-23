package Assignment.Function;

import Assignment.Model.StudentModel;

import java.util.Scanner;

public class DeleteStudent {
    StudentModel model = new StudentModel();
    public void deleteStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("<========== Delete Student ==========>");
        StudentsList studentsList = new StudentsList();
        studentsList.showListStudents();
        System.out.println("                                      ");
        System.out.println("Enter ID you want to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        model.getById(id);
        System.out.println("You want to delete student has ID = " + id);
        System.out.println("0: no \\ 1: yes ?");
        int choice = scanner.nextInt();

        model.deleteStudent(id, choice);
    }
}
