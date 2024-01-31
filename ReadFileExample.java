package ReadingFileText;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileExample {
    static Scanner scanner = new Scanner(System.in);
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        String path = scanner.nextLine();
        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
        //
        ReadFileExample readAndWriteFile = new ReadFileExample();
        List<Integer> numbers = readAndWriteFile.readFile();
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }

    private List<Integer> readFile() {
        List<Integer> numbers = new ArrayList<>();
        try {
            String filePath = null;
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
}
