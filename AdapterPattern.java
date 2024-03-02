package StructuralDesignPattern;
import java.io.File;
import java.util.Scanner;
public class AdapterPattern {
    public interface FileCalculator {
        long calculateSize(String path);
    }
    public static class Client {
        private final FileCalculator fileCalculator;
        public Client(FileCalculator fileCalculator) {
            this.fileCalculator = fileCalculator;
        }
        public void printFileSize(String path){
            long size = fileCalculator.calculateSize(path);
            System.out.println("Size: " + size);
        }
    }
    public static class FileUtil {
        public long calculateSize(File file) {
            // Calculate the size of the file
            // Return the size in bytes
            return 0;
        }
    }
    public static class FileCalculatorAdapter implements FileCalculator {
        private final FileUtil fileUtil;

        public FileCalculatorAdapter(FileUtil fileUtil) {
            this.fileUtil = fileUtil;
        }
        @Override
        public long calculateSize(String path) {
            File file = new File(path);
            return fileUtil.calculateSize(file);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file or folder path: ");
        String path = scanner.nextLine();

        FileUtil fileUtil = new FileUtil();
        FileCalculator fileCalculator = new FileCalculatorAdapter(fileUtil);
        Client client = new Client(fileCalculator);
        client.printFileSize(path);
    }
}
