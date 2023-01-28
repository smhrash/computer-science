package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/user/Desktop/new 1.txt");
        boolean exists = Files.exists(path);
        System.out.println("Exists = " + exists);
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1)) {
            String paragraph = reader.readLine();

            System.out.println(paragraph);


        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
    }
}
