package ReadingFileText;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy C:\\Users\\Administrator\\IdeaProjects\\Demo\\source-file C:\\Users\\Administrator\\IdeaProjects\\Demo\\target-file");
            return;
        }

        String sourceFile = args[0];
        String targetFile = args[1];

        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(targetFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytesCopied = 0;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                totalBytesCopied += bytesRead;
            }

            System.out.println("File copied successfully. Total bytes copied: " + totalBytesCopied);
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + sourceFile);
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}

