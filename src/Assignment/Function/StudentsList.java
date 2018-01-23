package Assignment.Function;

import Assignment.Emtity.Students;
import Assignment.Model.StudentModel;

import java.util.ArrayList;

public class StudentsList {
    private StudentModel model = new StudentModel();

    public void showListStudents(){
        ArrayList<Students> list = model.getListStudents();
        System.out.println("<=============================================================== Students List ===============================================================>");
        System.out.println("ID \t|| \t \t NAME \t\t ||\t\tGENDER \t ||\t\tBIRTHDAY  \t ||\t  \t STATUS  \t || \t PHONE \t ||\t\tADDRESS \t||\t\t EMAIL");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++){
            Students students = list.get(i);
            System.out.println(students.getId() + "\t||\t" + students.getStudentName() + "\t || \t" + (students.getStudentGender()==0?"Female":(students.getStudentGender()==1?"Male":"Other")) + " \t || \t"
                    + students.getStudentBirthday() + " \t || \t " + (students.getStudentStatus()==0?"Nghỉ học":"Đang học") + " \t ||  " + students.getStudentPhone()  + "  || \t" + students.getStudentAddress() + " \t||  \t"
                    +  students.getStudentEmail());
        }
        System.out.println("<=============================================================================================================================================>");
    }
}
