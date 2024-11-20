import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class L7Q4 {
    public static void main(String[] args) {
        String filename = "L7Q4_text.txt";
        int linecount = 0, wordcount = 0, charcount = 0;
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while ((line = reader.readLine()) != null){
                linecount++;
                
                String[] words = line.split("\\s+");
                charcount += line.replace(" ", "").length();
                wordcount += words.length;
            }
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Line: " + linecount);
        System.out.println("Word: " + wordcount);
        System.out.println("Character: " + charcount);
    }

}
