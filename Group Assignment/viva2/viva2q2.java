import java.util.Arrays;
import java.util.Scanner;

public class viva2q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Array 1: ");
        int[] array1 = parseArray(input);
        System.out.print("Array 2: ");
        int[] array2 = parseArray(input);
        input.close();

        int [] merged = mergeArray(array1, array2);
        System.out.println(Arrays.toString(merged));
    }
    
    public static int[] parseArray(Scanner input) {
        String[] inputArray = input.nextLine().replace(" ", "").split(",");
        int[] result = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            result[i] = Integer.parseInt(inputArray[i]);
        }
        return result;
    }

    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        mergedArray = Arrays.stream(mergedArray).distinct().sorted().toArray();
        return mergedArray;
    }
}
