package StringRegex;

public class EmailExampleTest {
    public static final String[] validEmail = new String[]{"nhathuynguyenhai@gmail.com", "nguyenchaienxetang@yahoo.com", "17t1021108husceduvn@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"17t1021108husceduvn@gmail.com", "17t1021108@husc.edu.vn", "dryenacs@yahoo.com.vn"};

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
