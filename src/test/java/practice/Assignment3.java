package practice;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Assignment3 {

    public static void main(String[] args) {
        Path path = Paths.get("/Users/user/Desktop/new 1.txt");
        Path path1 = Paths.get("/Users/user/Desktop/new 2.txt");
        boolean exists = Files.exists(path);
        System.out.println("Exists = " + exists);
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1)) {
            String paragraph = reader.readLine();

            System.out.println(paragraph);
            String[] words = paragraph.split(" ");
            String selectWord = "Bangalore";
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equalsIgnoreCase(selectWord)) {
                    count = count + 1;
                }
            }
            System.out.println("Number of occurrences of the word \"Bangalore\": " + count);

        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
        try (FileWriter fw = new FileWriter(path1.toString())) {
            BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);
            String newParagraph =reader.readLine().replace("Bangalore", "\nBangalore");
            fw.write(newParagraph);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Done!");
    }

}
