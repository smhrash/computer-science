package practice;

/*
Conclusion of Essay on Bangalore All in all, Bangalore is a beautiful city with the right balance of traditional and modern culture. Everyone must give this city a visit at least once in their life and see for themselves the excellence of the city bustling with youth and vigour. FAQ of Essay on Bangalore Question 1: What Bangalore is famous for? Answer 1: Bangalore is famous for being the Silicon Valley of India. This capital city of Karnataka is a renowned IT hub and is home to some of the world’SecondMinAndMaxNumber major IT corporations which operate out of the city. Moreover, Bangalore is also the hub to many start-ups and Indian tech companies. Question 2: Why is the Bangalore climate good? Answer 2: Since Bangalore is at the centre of the peninsula and is not too far off from the coasts on both sides, it benefits from both the monsoons. The city stands at a height of about 900mts or 3000ft from sea level. As a result, the higher the altitude, the colder it tends to get.

 */

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFiles {
    public static void main(String... args) {
        Path path = Paths.get("/Users/user/Desktop/new 2.txt");
        try (FileWriter fw = new FileWriter(path.toString())) {
            fw.write("Hello world from Upgrad!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Done!");
    }
}
