package L10Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class SubstitutionCipher implements MessageEncoder {
    String inputFileName;
    String outputFileName;
    int shift;
    public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }

    


    public String encode(String plainText) {
        return shiftText(plainText, shift);
    }


    public String decode(String cipherText) {
        return shiftText(cipherText, -shift);
    }

    public void processFile(boolean isEncoding) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String processedLine = isEncoding ? encode(line) : decode(line);
                writer.println(processedLine);
            }
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }

    private String shiftText(String text, int shift) {
        StringBuilder shiftedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                shiftedText.append((char) ((c - base + shift + 26) % 26 + base));
            } else {
                shiftedText.append(c); // Non-alphabet characters remain unchanged
            }
        }
        return shiftedText.toString();
    }
  
}
