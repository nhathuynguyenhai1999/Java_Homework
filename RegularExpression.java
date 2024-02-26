package StringRegex;

import sun.plugin.net.protocol.jar.CachedJarURLConnection;

import java.io.IOException;

public class RegularExpression {
    public static <Elements> void main(String[] args) {
        // Kiểm tra tính hợp lệ của số điện thoại
        System.out.println(validatePhoneNumber("(84)-(0978489648)")); // true
        System.out.println(validatePhoneNumber("(a8)-(22222222)"));      // false
        System.out.println(validatePhoneNumber("(84)-(22b22222)"));     // false
        System.out.println(validatePhoneNumber("(84)-(9978489648)"));   // false

        // Kiểm tra tính hợp lệ của tên lớp học
        System.out.println(validateClassName("C0223G"));  // true
        System.out.println(validateClassName("A0323K"));  // true
        System.out.println(validateClassName("M0318G"));  // false
        System.out.println(validateClassName("P0323A"));  // false

        String url = "http://dantri.com.vn/the-gioi.htm";
        String cssSelector = "CSS_selector_của_các_phần_tử_chứa_thông_tin_bài_hát";
        try {
            // Kết nối đến URL và lấy mã HTML của trang web
            CachedJarURLConnection Jsoup = null;
            Document doc = null;
            Jsoup.connect();

            // Lọc các phần tử chứa thông tin về bài hát
            Elements songElements = (Elements) doc.select(cssSelector);

            // Duyệt qua từng phần tử và hiển thị thông tin về bài hát
            int i = 0;
            while (!(songElements.size() <= i)) {
                Element element = songElements.get(i);
                // Xử lý và hiển thị thông tin về bài hát
                String songInfo = extractSongInfo(element);
                System.out.println(songInfo);
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Phương thức kiểm tra tính hợp lệ của số điện thoại
    public static boolean validatePhoneNumber(String phoneNumber) {
        String regex = "\\(\\d{2}\\)-(0\\d{9})";
        return phoneNumber.matches(regex);
    }

    // Phương thức kiểm tra tính hợp lệ của tên lớp học
    public static boolean validateClassName(String className) {
        String regex = "[CAP][0-9]{4}[GHIK]";
        return className.matches(regex);
    }

    // Phương thức để trích xuất thông tin về bài hát từ một phần tử HTML
    private static <Element> String extractSongInfo(Element element) {
        // Thực hiện các thao tác xử lý thông tin về bài hát từ phần tử HTML
        // Ví dụ: trích xuất tên bài hát, tên nghệ sĩ, thể loại, vv. từ phần tử HTML
        // Trong ví dụ này, chúng ta đơn giản chỉ lấy văn bản bên trong phần tử
        return element.toString();
    }
}


