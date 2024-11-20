import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        try {
            String sentence = "abcABC";
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
            for (char character : sentence.toCharArray()){
                writer.write(Integer.toString((int) character));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    } 
}

