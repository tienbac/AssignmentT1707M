package Assignment.Model;

import Assignment.Emtity.Students;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentModel {

    /**
     * Lấy danh sách các sinh viên trong database và trả về một
     * ArrayList các đối tượng trong Students.
     * **/
    public ArrayList<Students> getListStudents(){
        ArrayList<Students> listStudents = new ArrayList<>();

        Connection connection = ConnectionHelper.getConnection();
        if (connection == null){
            return listStudents;
        }
        try {
            String sqlSelect = "SELECT * FROM students";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sqlSelect);
            while (rs.next()){
                int id = rs.getInt("id");
                String rollNumber = rs.getString("rollNumberStudent");
                String name = rs.getString("studentName");
                int gender = rs.getInt("studentGender");
                String birthday = rs.getString("studentBirthday");
                String phone = rs.getString("studentPhone");
                String email = rs.getString("studentEmail");
                String address = rs.getString("studentAddress");
                String created = rs.getString("createdAt");
                String updated = rs.getString("updateAt");
                int status = rs.getInt("studentStatus");

                Students students = new Students(id, rollNumber, name, gender, birthday, phone, email, address, created, updated, status);
                listStudents.add(students);

            }
        }catch (SQLException e){
            System.err.println("Can't connect to database!");
        }
        return listStudents;
    }

    /**
     * Hiển thị thông tin chi tiết của sinh viên khi nhập ID
     * **/
    public Students getById(int id){
        Students students = null;
        Connection connection = ConnectionHelper.getConnection();
        if (connection == null){
            return null;
        }
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM students WHERE id =" + id);
            while (rs.next()){
                int studentId = rs.getInt("id");
                String rollNumber = rs.getString("rollNumberStudent");
                String name = rs.getString("studentName");
                int gender = rs.getInt("studentGender");
                String birthday = rs.getString("studentBirthday");
                String phone = rs.getString("studentPhone");
                String email = rs.getString("studentEmail");
                String address = rs.getString("studentAddress");
                String createdAt = rs.getString("createdAt");
                String updateAt = rs.getString("updateAt");
                int status = rs.getInt("studentStatus");
                students = new Students(studentId, rollNumber, name, gender, birthday, phone, email, address, createdAt, updateAt, status);

                if (id == studentId){
                    System.out.println("<========== Student  Information ==========>");
                    System.out.println("ID         : \t" + studentId);
                    System.out.println("RollNumBer : \t" + rollNumber);
                    System.out.println("Name       : \t" + name);
                    System.out.println("Gender     : \t" + (gender==1?"Nam":(gender==0?"Nữ":"Khác")));
                    System.out.println("Birthday   : \t" + birthday);
                    System.out.println("Phone      : \t" + phone);
                    System.out.println("Email      : \t" + email);
                    System.out.println("Address    : \t" + address);
                    System.out.println("CreatedAt  : \t" + (createdAt==null?"Not Available": createdAt));
                    System.out.println("UpdateAt   : \t" + (updateAt==null?"Not Available": updateAt));
                    System.out.println("Status     : \t" + (status==0?"Nghỉ học":"Đang học"));
                    System.out.println("<============ Information By ID ===========>");
                }
            }
        } catch (SQLException e) {
            System.err.println("Sorry! I can't connect to database. Please try again!");
        }
        return students;
    }

    /**
     * Hiển thị thông tin sinh viên khi nhập RollNumber ( mã sinh viên )
     * **/
    public Students getByRollNumber(String rollNumber){
        Students students = null;
        Connection connection = ConnectionHelper.getConnection();
        if (connection == null){
            return null;
        }
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM students WHERE rollNumberStudent = " + rollNumber);
            while (rs.next()){
                int id = rs.getInt("id");
                String strollNumber = rs.getString("rollNumberStudent");
                String name = rs.getString("studentName");
                int gender = rs.getInt("studentGender");
                String birthday = rs.getString("studentBirthday");
                String phone = rs.getString("studentPhone");
                String email = rs.getString("studentEmail");
                String address = rs.getString("studentAddress");
                int status = rs.getInt("status");
                students = new Students(id, strollNumber, name, gender, birthday, phone, email, address, status);

                if (strollNumber.equals(rollNumber)){
                    System.out.println("<========== Student Information ==========>");
                    System.out.println("ID         : \t \t \t" + id);
                    System.out.println("RollNumBer : \t" + strollNumber);
                    System.out.println("Name       : \t \t \t" + name);
                    System.out.println("Gender     : \t \t" + (gender==1?"Nam":(gender==0?"Nữ":"Khác")));
                    System.out.println("Birthday   : \t \t" + birthday);
                    System.out.println("Phone      : \t \t \t" + phone);
                    System.out.println("Email      : \t \t \t" + email);
                    System.out.println("Address    : \t \t" + address);
                    System.out.println("Status     : \t \t" + (status==0?"Nghỉ học":"Đang học"));
                    System.out.println("<=============== RollNumber ==============>");
                }
            }
        } catch (SQLException e) {
            System.err.println("Sorry! I can't connect to database. Please try again!");
        }
        return students;
    }


    /**
     * Thêm mới sinh viên vào database
     * **/
    public Students addStudent(String rollNumber, String name, int gender, String birthday, String email, String phone, String address, String createdAt, int status){
        Connection connection = ConnectionHelper.getConnection();
        if (connection == null) {
            return null;
        }
        try{
            String sqlInsert = "INSERT INTO students(rollNumberStudent, studentName, studentGender, studentBirthday, studentEmail, studentPhone, studentAddress, createdAt, studentStatus) VALUE(?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setString(1, rollNumber);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, gender);
            preparedStatement.setString(4, birthday);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, phone);
            preparedStatement.setString(7, address);
            preparedStatement.setString(8, createdAt);
            preparedStatement.setInt(9, status);
            preparedStatement.executeUpdate();
            System.out.println("INSERT SUCCESS");
        } catch (SQLException e) {
            System.err.println("Try again!");
        }
        return null;
    }

    /**
     * Cập nhật thông tin sinh viên theo ID
     * **/
    public Students updateStudent(int id, String rollNumber, String name, int gender, String birthday, String email, String phone, String address, String updateAt, int status){
        Connection connection = ConnectionHelper.getConnection();
        Scanner scanner = new Scanner(System.in);
        if (connection == null){
            return null;
        }
        try {
            String sqlUpdate = "UPDATE students SET rollNumberStudent =?, studentName =?, studentGender =?, studentBirthday =?, studentEmail =?, studentPhone =?, studentAddress =?, updateAt =?, studentStatus =? WHERE id =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, rollNumber);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, gender);
            preparedStatement.setString(4, birthday);
            preparedStatement.setString(5,email);
            preparedStatement.setString(6,phone);
            preparedStatement.setString(7, address);
            preparedStatement.setString(8, updateAt);
            preparedStatement.setInt(9, status);
            preparedStatement.setInt(10, id);
            preparedStatement.executeUpdate();
            System.out.println("UPDATE SUCCESS!");
        } catch (SQLException e) {
            System.err.println("Can't not update information of student has id = " + id);
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Xóa sinh viên theo ID
     * **/
    public Students deleteStudent(int id, int choice){
        Connection connection = ConnectionHelper.getConnection();
        Students students = null;

        if (connection == null){
            return null;
        }
        try{
            switch (choice){
                case 1:
                    String sqlDelete = "DELETE FROM students WHERE id = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
                    preparedStatement.setInt(1, id);
                    preparedStatement.executeUpdate();
                    System.out.println("DELETE SUCCESS!");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choice 0 or 1");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Can't delete this student!");
            e.printStackTrace();
        }
        return students;
    }

}
