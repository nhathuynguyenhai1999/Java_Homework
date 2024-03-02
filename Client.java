package StructuralDesignPattern;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
interface Downloader {
    void download(String url, String destination);
}
class FileDownloader implements Downloader {
    private final String userAgent;
    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }
    @Override
    public void download(String url, String destination) {
        try {
            URL downloadUrl = new URL(url);
            URLConnection connection = downloadUrl.openConnection();
            connection.setRequestProperty("User-Agent", userAgent);

            try (InputStream in = connection.getInputStream();
                 FileOutputStream out = new FileOutputStream(destination)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }
            System.out.println("File downloaded successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FileDownloaderProxy implements Downloader {
    private final FileDownloader fileDownloader;
    public FileDownloaderProxy() {
        fileDownloader = new FileDownloader("Mozilla/5.0");
    }
    @Override
    public void download(String url, String destination) {
        fileDownloader.download(url, destination);
    }
}

public class Client {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();
        downloader.download("https://example.com/file.txt", "file.txt");
    }
}
