public class StaticMethodV2023MainStudent {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    Student(int r , String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + "" + name + college);
    }
    public static void main(String[] args){
        Student.change();
        Student s1 = new Student(11231, "Nguyen Hai Nhat Huy");
        Student s2 = new Student (11231, "Nguyen Van Cong");
        Student s3 = new Student (11231,"Truong Trac Van");
        Student s4 = new Student (11231, "Ngo Sy Hoang");
        Student s5 = new Student (11231, "Dang My Duyen");
        Student s6 = new Student (11231, "Nguyen Van Binh");
        Student s7 = new Student(11231, "Nguyen Cong Loc");
        Student s8 = new Student(11231,"Le Huy Hoang");
        Student s9 = new Student(11231,"Duong Minh Hieu");
        Student s10 = new Student (10230, "Le Huu Su");
        Student s11 = new Student(10230,"Huynh Dinh Viet Toan");
        Student s12 = new Student(10230,"Nguyen Nhat Minh");
        Student s13 = new Student(10230,"Le Gia Huy");
        Student s14 = new Student (10230,"Quang Tien Phu");
        Student s15 = new Student(10230,"Le Thanh Nhon");
        Student s16 = new Student (10230,"Trinh Khoa");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
        s7.display();
        s8.display();
        s9.display();
        s10.display();
        s11.display();
        s12.display();
        s13.display();
        s14.display();
        s15.display();
        s16.display();
    }
}