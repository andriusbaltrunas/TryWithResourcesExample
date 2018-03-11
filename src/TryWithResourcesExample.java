import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by andriusbaltrunas on 3/11/2018.
 */
//only from Java 7
public class TryWithResourcesExample {

    public static void main(String[] args) {
        // automatically close file after try block done this work
        try (BufferedReader bf = new BufferedReader(new FileReader("names.txt"))) {
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {// catch not needed in exception added to methos signature
            System.out.println("problems with file " + e);
        }
    }
}
