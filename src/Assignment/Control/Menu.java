package Assignment.Control;

import Assignment.Function.*;
import Assignment.Model.CloseConnectionHelper;
import Assignment.Model.StudentModel;

import java.util.Scanner;

public class Menu {
    public  Menu menu(){
        CloseConnectionHelper closeConnectionHelper = new CloseConnectionHelper();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println("<========== MENU ==========>");
        System.out.println("||    1: Students List    ||");
        System.out.println("||    2: Students Info    ||");
        System.out.println("||    3: Add Student      ||");
        System.out.println("||    4: Update Student   ||");
        System.out.println("||    5: Delete Student   ||");
        System.out.println("||    6: EXIT             ||");
        System.out.println("<==========================>");
        System.out.println("                            ");
        System.out.print("Please enter your action: ");
        choice = scanner.nextInt();
        System.out.println("                            ");
        if (choice==1){
            System.out.println("Your choice is 1: Students List");
        }else if (choice==2){
            System.out.println("Your choice is 2: Student Info");
        }else if (choice==3){
            System.out.println("Your choice is 3: Add Student");
        }else if (choice==4){
            System.out.println("Your choice is 4: Update Student");
        }else if (choice==5){
            System.out.println("Your choice is 5: Delete Student");
        }else if (choice==6){
            System.out.println("Your choice is 6: EXIT");
        }else {
            System.out.println("Choice again!");
        }


        switch (choice){
            case 1:
                StudentsList studentsList = new StudentsList();
                studentsList.showListStudents();
                break;
            case 2:
//                int choice2 = 0;
//                System.out.println("1 : Tìm theo ID");
//                System.out.println("2 : Tìm theo RollNumber");
//                System.out.print("Bạn muốn tìm thông tin chi tiết sinh viên theo: ");
//                choice2 = scanner.nextInt();
//                scanner.nextLine();
//                switch (choice2){
//                    case 1:
//                        StudentInfoById studentInfoById = new StudentInfoById();
//                        studentInfoById.showStudentInfo();
//                        break;
//                    case 2:
//                        StudentInfoByRoll studentInfoByRoll = new StudentInfoByRoll();
//                        studentInfoByRoll.showStudentByRoll();
//                    }
//                    break;
                StudentInfoById studentInfoById = new StudentInfoById();
                studentInfoById.showStudentInfo();
                break;
            case 3:
                AddStudent addStudent = new AddStudent();
                addStudent.addStudent();
                break;
            case 4:
                UpdateStudent updateStudent = new UpdateStudent();
                updateStudent.updateStudent();
                break;
            case 5:
                DeleteStudent deleteStudent = new DeleteStudent();
                deleteStudent.deleteStudent();
                break;
            case 6:
                closeConnectionHelper.closeConnection();
                System.out.println("GOOD BYE! SEE YOU NEXT TIME!");
                System.exit(0);
                break;
            default:
                System.out.println("Please enter your choice from 1 to 6!");
                break;
            }
            return null;
    }

}
