package L10Q4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Appointment implements Searchable {
    private int day;
    private int month;
    private int year;
    private int startTime;
    private int endTime;

    public Appointment(int day, int month, int year, int startTime, int endTime) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;

    }
    
    @Override
    public String toString() {
        return day + "/" + month + "/" + year + " " + startTime + "-" + endTime;
    }

    public void Save() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("appointment.txt", true))) {
            writer.write(this.toString());
            writer.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }      
    
    @Override
    public boolean Search() {
        try(BufferedReader reader = new BufferedReader(new FileReader("appointment.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                String[] date = data[0].split("/");
                String[] time = data[1].split("-");
                int d = Integer.parseInt(date[0]);
                int m = Integer.parseInt(date[1]);
                int y = Integer.parseInt(date[2]);
                int start = Integer.parseInt(time[0]);
                int end = Integer.parseInt(time[1]);
                if (d == day && m == month && y == year && start < endTime && end > startTime) {
                    System.out.println("Appointment crashed with: " + line);
                    return false;
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        } 
        return true;
    }
}
