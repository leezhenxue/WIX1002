public class viva1Q6 {
    public static void main(String[] args) {
        for (int row = 0; row < 7; row++) {
            // Letter M
            for (int col = 0; col < 7; col++) {
                if (col == 0 || col == 6 || (row == col && col <= 3) || (col == 6 - row && col >= 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); // Space between letters

            // Letter A
            for (int col = 0; col < 7; col++) {
                if (col == 0 || col == 6 || row == 3 || (row == 0 && (col > 0 && col < 6))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Letter L
            for (int col = 0; col < 7; col++) {
                if (col == 0 || row == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Letter A (repeated)
            for (int col = 0; col < 7; col++) {
                if (col == 0 || col == 6 || row == 3 || (row == 0 && (col > 0 && col < 6))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Letter Y
            for (int col = 0; col < 7; col++) {
                if ((row == col && row < 4) || (col == 6 - row && row < 4) || (row >= 4 && col == 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Letter S
            for (int col = 0; col < 7; col++) {
                if ((row == 0 && col > 0) || (row == 3 && col > 0 && col < 6) || (row == 6 && col < 6) || (col == 0 && row > 0 && row < 3) || (col == 6 && row > 3 && row < 6)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Letter I
            for (int col = 0; col < 7; col++) {
                if (row == 0 || row == 6 || col == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Letter A (repeated)
            for (int col = 0; col < 7; col++) {
                if (col == 0 || col == 6 || row == 3 || (row == 0 && (col > 0 && col < 6))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // Move to the next row
        }
    }
}
