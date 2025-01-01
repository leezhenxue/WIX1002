package L10Q3;

public class Tester {
    public static void main(String[] args) {
        ShuffleCipher cipher = new ShuffleCipher("plainText.txt", "encodedText.txt", 1);
        cipher.encode();

        ShuffleCipher cipher2 = new ShuffleCipher("encodedText.txt", "decoded.txt", 1);
        cipher2.decode();
    }
}
