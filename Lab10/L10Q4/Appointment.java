package L10Q4;

public class Appointment implements Searchable {
    private int day;
    private int month;
    private int year;
    private int startHour;
    private int endHour;

    public Appointment(int day, int month, int year, int startHour, int endHour) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startHour = startHour;
        this.endHour = endHour;

    }
}
