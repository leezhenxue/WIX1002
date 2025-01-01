package L10Q2;
public class Tester {
    public static void main(String[] args) {
            // Input and output file names
            String inputFileName = "plainText.txt";
            String cipherFileName = "cipherText.txt";
            String decodedFileName = "decodedText.txt";

            // Create a SubstitutionCipher instance with shift 3
            SubstitutionCipher cipher = new SubstitutionCipher(inputFileName, cipherFileName, 3);

            // Encode the text
            cipher.processFile(true); // Encoding mode
            System.out.println("Encoded text written to: " + cipherFileName);

            // Decode the encoded text
            SubstitutionCipher cipher2 = new SubstitutionCipher(cipherFileName, decodedFileName, 3);
            cipher2.processFile(false); // Decoding mode
            System.out.println("Decoded text written to: " + decodedFileName);
    
    }    
}
