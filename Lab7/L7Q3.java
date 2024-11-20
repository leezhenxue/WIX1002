import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class L7Q3 {
    public static void main(String[] args) {
        String filename = "L7Q3_random_essay.txt";
        int linecount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while (reader.readLine() != null){
                linecount++;
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("File " + filename + " not found");
        } catch (IOException e){
            System.out.println("IOError: " + e.getMessage());
        }
            
        String[] lines = new String[linecount];

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            for (int i = 0; i < linecount; i++) {
                lines[i] = reader.readLine(); // Read each line into the array
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("IOError: " + e.getMessage());
            return; // Exit program if an IO error occurs
        }

        try (FileWriter writer = new FileWriter("reverse.txt")) { // Open in append mode
            for (int line = 0; line < lines.length; line++) {
                String[] words = lines[lines.length - 1 - line].split("\\s+|,\\s*|\\.\\s*"); // Split into words
                String[] rwords = new String[words.length]; // Reverse the words
                for (int word = 0; word < words.length; word++) {
                    rwords[word] = words[words.length - 1 - word];
                }
                for (String rword : rwords) {
                    writer.write(rword + " "); // Add reversed words and a new line
                }
                writer.write(System.lineSeparator());
            }
            // Print success message once after writing all lines
            System.out.println("Sentences appended to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
