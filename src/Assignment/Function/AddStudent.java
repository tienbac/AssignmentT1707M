package Assignment.Function;

import Assignment.Control.Check;
import Assignment.Emtity.Students;
import Assignment.Model.StudentModel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AddStudent {
    StudentModel model = new StudentModel();
    Students students = new Students();
    public void addStudent(){
        boolean check1 = true;
        Check check = new Check();
        Date now = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("<========== Add Student ==========>");
        String sRollNumber = null;
        while (check1){
            System.out.println("Student Roll Number: ");
            String rollNumber = scanner.nextLine();
            if (rollNumber.length() >=6 && rollNumber != null){
                sRollNumber = rollNumber;
                break;
            }
            System.out.println("Student RollNumber is required!");
        }
        String sName = null;
        while (check1){
            System.out.println("Student Name: ");
            String name = scanner.nextLine();
            if (name.length() >= 10 && name != null){
                sName = name;
                break;
            }
            System.out.println("Student Name is required!");
        }
        int sGender = 1;
        while (check1){
            System.out.println("Student Gender: ");
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
            System.out.println("Student Birthday: ");
            String birthday = scanner.nextLine();
            if (birthday.length() >= 8 && birthday != null && birthday.length() <= 10){
                sBirthday = birthday;
                break;
            }
            System.out.println("Student Birthday is required!");
        }
        String sEmail = null;
        while (check1){
            System.out.println("Student Email: ");
            String email = scanner.nextLine();
            if (email.length() >= 10 && email != null){
                sEmail = email;
                break;
            }
            System.out.println("Student Email is required!");
        }
        String sPhone = null;
        while (check1){
            System.out.println("Student Phone: ");
            String phone = scanner.nextLine();
            if (phone.length() <= 11 && phone != null && phone.length() >= 10){
                sPhone = phone;
                break;
            }
            System.out.println("Student Phone is required!");
        }
        String sAddress = null;
        while (check1){
            System.out.println("Student Address: ");
            String address = scanner.nextLine();
            if (address.length() >= 5 && address != null){
                sAddress = address;
                break;
            }
            System.out.println("Student Address is required!");
        }
        String createdAt = simpleDateFormat.format(now.getTime());
        int sStatus = 1;
        while (check1){
            System.out.println("Student Status: ");
            int status = scanner.nextInt();
            scanner.nextLine();
            if (status > -1 && status < 2){
                sStatus = status;
                break;
            }
            System.out.println("Student Status is required!");
        }

        model.addStudent(sRollNumber, sName, sGender, sBirthday, sEmail, sPhone, sAddress, createdAt, sStatus);
    }
}
