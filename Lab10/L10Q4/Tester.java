package L10Q4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter start time (hour): ");
        int startTime = scanner.nextInt();
        System.out.print("Enter end time (hour): ");
        int endTime = scanner.nextInt();

        Appointment newAppointment = new Appointment(day, month, year, startTime, endTime);

        // Search for conflicts
        if (newAppointment.Search()) {
            System.out.println("The time slot is available. The appointment saved.");
            newAppointment.Save();
        } else {
            System.out.println("The time slot is not available. Please choose another time.");
        }

        scanner.close();
    }
}

