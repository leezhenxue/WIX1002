public class Room {
    private String roomNumber;
    private String roomType;
    private double rentalPrice;
    private int days;
    private double discount = 0.00;
    private static int totalRooms;

    //Constructor
    public Room (String roomNumber, String roomType, double rentalPrice) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.rentalPrice = rentalPrice;
        totalRooms++;
    }

    //Encapsulation
    //getter
    public String getRoomNumber() {
        return roomNumber;
    }
    public String getRoomType() {
        return roomType;
    }
    public double getRentalPrice() {
        return rentalPrice;
    }
    public int getDays() {
        return days;
    }
    public double getDiscount() {
        return discount;
    }
    //setter
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
    public void setDays(int days) {
        this.days = days;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    //Method Overloading
    public double calculateRent(int days) {
        return rentalPrice * days;
    }
    public double calculateRent(int days, double discount) {
        return rentalPrice * days - discount;
    }

    //Wrapper Class
    public static int getTotalRooms() {
        return totalRooms;
    }

    public static void displayRoomDetails(Room room) {
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.printf("Rental Price: $%.1f\n", room.getRentalPrice());
        System.out.println("Total Rooms: " + totalRooms);
        System.out.printf("Total Rent for %d days: $%.1f\n", room.days, room.calculateRent(room.days));
        if (room.discount != 0.00)
            System.out.printf("Total Rent for %d days with $%.1f discount: $%.1f\n", room.days, room.discount, room.calculateRent(room.days, room.discount));
    }

    public static void main(String[] args) {
        Room a = new Room("123", "Single", 100.0);
        a.setDays(30);
        displayRoomDetails(a);
        System.out.println();
        Room b = new Room ("456", "Double", 240.5);
        b.setDays(6);
        b.setDiscount(30);
        displayRoomDetails(b);
        System.out.println();
        Room c = new Room ("789", "Suit", 134.0);
        c.setDays(7);
        c.setDiscount(30);
        displayRoomDetails(c);
    }
}
