package Q4;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class L7Q4 {
    public static void main(String[] args) {
        String filename = "L7Q4_text.txt";
        int linecount = 0, wordcount = 0, charcount = 0;
        String line;
        try {
            Scanner input = new Scanner(new FileInputStream(filename));
            while ((line = input.nextLine()) != null){
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
