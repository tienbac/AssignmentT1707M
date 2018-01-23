package Assignment.Function;

import Assignment.Model.StudentModel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UpdateStudent {
    StudentModel model = new StudentModel();
    public void updateStudent(){
        boolean check1 = true;
        Date now = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("<======================================== Update Student ========================================>");
        System.out.println("                                                                                                  ");
        StudentsList studentsList = new StudentsList();
        studentsList.showListStudents();
        System.out.println("                                                                                                  ");
        System.out.print("Enter ID you want to update information: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        model.getById(id);
        System.out.println("                                            ");
        System.out.println("<================= UPDATE =================>");
        String sRollNumber = null;
        while (check1){
            System.out.println("New Student Roll Number: ");
            String rollNumber = scanner.nextLine();
            if (rollNumber.length() >=6 && rollNumber != null){
                sRollNumber = rollNumber;
                break;
            }
            System.out.println("Student RollNumber is required!");
        }
        String sName = null;
        while (check1){
            System.out.println("New Student Name: ");
            String name = scanner.nextLine();
            if (name.length() >= 10 && name != null){
                sName = name;
                break;
            }
            System.out.println("Student Name is required!");
        }
        int sGender = 1;
        while (check1){
            System.out.println("New Student Gender: ");
            int gender = scanner.nextInt();
            scanner.nextLine();
            if (gender > -1 && gender < 3){
                sGender = gender;
                break;
            }
            System.out.println("Student Gender is required!");
        }
        String sBirthday = null;
        while (check1){
            System.out.println("New Student Birthday: ");
            String birthday = scanner.nextLine();
            if (birthday.length() >= 8 && birthday != null && birthday.length() <= 10){
                sBirthday = birthday;
                break;
            }
            System.out.println("Student Birthday is required!");
        }
        String sEmail = null;
        while (check1){
            System.out.println("New Student Email: ");
            String email = scanner.nextLine();
            if (email.length() >= 10 && email != null){
                sEmail = email;
                break;
            }
            System.out.println("Student Email is required!");
        }
        String sPhone = null;
        while (check1){
            System.out.println("New Student Phone: ");
            String phone = scanner.nextLine();
            if (phone.length() <= 11 && phone != null && phone.length() >= 10){
                sPhone = phone;
                break;
            }
            System.out.println("Student Phone is required!");
        }
        String sAddress = null;
        while (check1){
            System.out.println("New Student Address: ");
            String address = scanner.nextLine();
            if (address.length() >= 5 && address != null){
                sAddress = address;
                break;
            }
            System.out.println("Student Address is required!");
        }
        String updateAt = simpleDateFormat.format(now.getTime());
        int sStatus = 1;
        while (check1){
            System.out.println("New Student Status: ");
            int status = scanner.nextInt();
            scanner.nextLine();
            if (status > -1 && status < 2){
                sStatus = status;
                break;
            }
            System.out.println("Student Status is required!");
        }

        model.updateStudent(id, sRollNumber, sName, sGender, sBirthday, sEmail, sPhone, sAddress, updateAt, sStatus);

        model.getById(id);
    }
}
