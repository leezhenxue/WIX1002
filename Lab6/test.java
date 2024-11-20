public class test {
    public static void main(String[] args) {
        int[] array1 = new int [5];
        int[] array2 = new int [5];

        modify1(array1);
        array2 = modify2(array2);

        System.out.println(java.util.Arrays.toString(array2));
    }

    public static void modify1(int[] array1){
        array1[2] = 5;
    }

    public static int[] modify2(int[] array2){
        array2 = new int[5];
        array2[1] = 5;
        
        return array2;
    }
}
