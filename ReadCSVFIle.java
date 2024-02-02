package ReadingFileText;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadCSVFIle {
    public static void main(String[] args) {
        String csvFilePath = "C:\\Users\\Administrator\\IdeaProjects\\Variable-DataType\\out\\production\\Variable-DataType\\ReadingFileText";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            System.out.println("Danh sách các quốc gia:");
            while ((line = br.readLine()) != null){
                String[] countryData = line.split(",");
                if (countryData.length >= 3){
                    int id = Integer.parseInt(countryData[0].trim());
                    String code = countryData[1].trim();
                    String name = countryData[2].trim();
                    System.out.println("ID: " + id + ", Code: " + code + ", Name: " + name);
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
