package Assignment.Emtity;

/**
 * Emtity/Student là Class chứa các thuọc tính của Student với bản dữ liệu trong database.
 * Contructor chứa các trường thông tin của một sinh viên:
 * rollNumberStudent, studentName, studentGender, studentBirthday, studentPhone, studentEmail, studentAddress, studentStatus
 * Luôn cần có một Contructor rỗng mặc định khi tạo một Contructor tùy chỉnh!
 * @author PHẠM TIẾN BẮC - D00479 - FPT APTECH HÀ NỘI
 * */

public class Students {
    private int id;
    private String rollNumberStudent;
    private String studentName;
    private int studentGender;
    private String studentBirthday;
    private String studentPhone;
    private String studentEmail;
    private String studentAddress;
    private String createAt;
    private String updateAt;
    private int studentStatus;

    public Students() {
    }

    public Students(String rollNumberStudent, String studentName, int studentGender, String studentBirthday, String studentPhone, String studentEmail, String studentAddress, int studentStatus) {
        this.rollNumberStudent = rollNumberStudent;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentBirthday = studentBirthday;
        this.studentPhone = studentPhone;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.studentStatus = studentStatus;
    }

    public Students(String rollNumberStudent, String studentName, int studentGender, String studentBirthday, String studentPhone, String studentEmail, String studentAddress, String createAt, String updateAt, int studentStatus) {
        this.rollNumberStudent = rollNumberStudent;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentBirthday = studentBirthday;
        this.studentPhone = studentPhone;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.studentStatus = studentStatus;
    }

    public Students(String rollNumberStudent, String studentName, int studentGender, String studentBirthday, String studentPhone, String studentEmail, String studentAddress, String createAt, int studentStatus) {
        this.rollNumberStudent = rollNumberStudent;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentBirthday = studentBirthday;
        this.studentPhone = studentPhone;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.createAt = createAt;
        this.studentStatus = studentStatus;
    }

    public Students(int id, String rollNumberStudent, String studentName, int studentGender, String studentBirthday, String studentPhone, String studentEmail, String studentAddress, int studentStatus) {
        this.id = id;
        this.rollNumberStudent = rollNumberStudent;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentBirthday = studentBirthday;
        this.studentPhone = studentPhone;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.studentStatus = studentStatus;
    }

    public Students(int id, String rollNumberStudent, String studentName, int studentGender, String studentBirthday, String studentPhone, String studentEmail, String studentAddress, String createAt, String updateAt, int studentStatus) {
        this.id = id;
        this.rollNumberStudent = rollNumberStudent;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentBirthday = studentBirthday;
        this.studentPhone = studentPhone;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.studentStatus = studentStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRollNumberStudent() {
        return rollNumberStudent;
    }

    public void setRollNumberStudent(String rollNumberStudent) {
        this.rollNumberStudent = rollNumberStudent;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(int studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(String studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public int getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(int studentStatus) {
        this.studentStatus = studentStatus;
    }
}
