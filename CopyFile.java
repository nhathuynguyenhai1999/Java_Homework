package ReadingFileText;
import java.io.*;
public class CopyFile {
    public static void copyFile(String sourceFileName, String targetFileName) {
        try {
            File sourceFile = new File(sourceFileName);
            if (!sourceFile.exists()) {
                System.out.println("Tệp nguồn không tồn tại.");
                return;
            }
            //--------------------------------------------------//
            File targetFile = new File(targetFileName);
            if (targetFile.exists()) {
                System.out.println("Tệp đích đã tồn tại. Vui lòng chọn tên khác.");
                return;
            }
            //--------------------------------------------------//
            FileReader fileReader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(targetFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            int character;
            int charCount = 0;
            //--------------------------------------------------//
            while ((character = bufferedReader.read()) != -1) {
                bufferedWriter.write(character);
                charCount++;
            }
            //--------------------------------------------------//
            bufferedWriter.close();
            bufferedReader.close();
            System.out.println("Sao chép tệp thành công. Số ký tự: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Lỗi: Tệp nguồn không tồn tại.");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc hoặc ghi tệp tin.");
        }
    }
    public static void main(String[] args) {
        // Gọi phương thức copyFile với tên tệp nguồn và tên tệp đích
        copyFile("source.txt", "target.txt");
    }
}

