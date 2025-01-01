package L10Q3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ShuffleCipher {
    private String inputFileName;
    private String outputFileName;
    private int N;

    public ShuffleCipher(String inputfileName, String outputFileName, int N) {
        this.inputFileName = inputfileName;
        this.outputFileName = outputFileName;
        this.N = N;
    }

    public void encode() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))){
            
            String text;
            while ((text = reader.readLine()) != null) {
                writer.write(shuffle(text, this.N));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }

    public void decode() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            String text;
            while ((text = reader.readLine()) != null) {
                writer.write(reverseShuffle(text, this.N));
                writer.newLine(); 
            }
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }

    private String shuffle(String text, int N) {
        char[] textArray = text.toCharArray();
        for (int count = 0; count < N; count++) {
            char[] shuffledArray = new char[textArray.length];
            for (int i = 0; i < textArray.length / 2; i++) {
                shuffledArray[i * 2] = textArray[i];
            }

            // Fill odd indices of shuffledArray with the second half of textArray
            int j = 0;
            for (int i = 1; i < textArray.length; i += 2) {
                shuffledArray[i] = textArray[textArray.length / 2 + j];
                j++;
            }
            if (textArray.length % 2 != 0) {
                shuffledArray[textArray.length - 1] = textArray[textArray.length - 1];
            }
            textArray = shuffledArray;
        }
        return new String(textArray);
    }

    private String reverseShuffle(String text, int N) {
        char[] textArray = text.toCharArray();

        for (int count = 0; count < N; count++) {
            char[] reversedArray = new char[textArray.length];
            int mid = textArray.length / 2;

            // Reverse the even and odd index logic: 
            // Fill the first half of the array with characters from the even indices
            int j = 0;
            for (int i = 0; i < mid; i++) {
                reversedArray[i] = textArray[i * 2];
            }
            
            for (int i = mid; i < textArray.length; i++) {
                if ((i - mid) * 2 + 1 == textArray.length) {
                    reversedArray[i] = textArray[i];
                    break;
                }
                reversedArray[i] = textArray[(i - mid) * 2 + 1];
            }

            // Update textArray for the next reverse pass
            textArray = reversedArray;
        }

        return new String(textArray);
    }

}
