import java.util.Scanner;

public class Q4 {
    private static String format (int number, int width){
        String str = Integer.toString(number);
        int length = str.length();
        
        if (length>=width){
            return str;
        }
        
        String result = "";
        for (int i = 0 ; i < width-length; i++){
            result += "0";
        }
        
        result += str;
        return result;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and width");
        int number = sc.nextInt();
        int width = sc.nextInt();
        System.out.print("format("+number+","+width+")");
        System.out.print("Result: " + format(number,width));
    }
}
