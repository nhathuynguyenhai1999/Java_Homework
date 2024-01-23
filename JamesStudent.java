package com.StudentsJames;

public class JamesStudent {
    private String name = "Huy";
    private String classes = "C11";

    public static void main(String[] args) {
        // Tạo đối tượng Student
        JamesStudent student = new JamesStudent();

        // Truy cập phương thức setName và setClasses
        student.setName("Alice");
        student.setClasses("C01");
    }
    public JamesStudent() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes){
        this.classes = classes;
    }
}
