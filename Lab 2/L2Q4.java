import java.util.Scanner;
public class L2Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int allsecond, second, minute, hour;
        
        System.out.print("Enter the number of seconds: ");
        allsecond = input.nextInt();
        hour = allsecond / 3600;
        minute = (allsecond - hour * 3600) / 60;
        second = (allsecond - (hour * 3600) - (minute * 60));
        
        System.out.println(allsecond + " seconds is " + hour + " hours, " + minute + " minutes and " + second + " seconds");
    }
}