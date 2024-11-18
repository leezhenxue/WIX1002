import java.io.*;
import java.util.Scanner;

public class CourseCodeNameExample {
    public static void main(String[] args) {
        String fileName = "coursename.dat";

        // Predefined course codes and names
        String[] courseCodes = {"WXES1116", "WXES1115", "WXES1110", "WXES1112"};
        String[] courseNames = {"Programming I", "Data Structure", "Operating System", "Computing Mathematics I"};

        // Write the course data to a binary file
        writeCourseData(fileName, courseCodes, courseNames);

        // Allow the user to query course names by course code
        searchCourseByCode(fileName);
    }

    // Method to write predefined course codes and names to a binary file
    private static void writeCourseData(String fileName, String[] codes, String[] names) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(codes.length); // Write the number of courses
            for (int i = 0; i < codes.length; i++) {
                dos.writeUTF(codes[i]);  // Write course code
                dos.writeUTF(names[i]); // Write course name
            }
            System.out.println("Course data successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    }

    // Method to search for a course name by course code
    private static void searchCourseByCode(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int numCourses = dis.readInt(); // Read the number of courses

            // Read all course codes and names into memory
            String[] codes = new String[numCourses];
            String[] names = new String[numCourses];
            for (int i = 0; i < numCourses; i++) {
                codes[i] = dis.readUTF();  // Read course code
                names[i] = dis.readUTF(); // Read course name
            }

            // Allow the user to search
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a course code: ");
            String courseCode = scanner.nextLine();

            // Search for the course code and display the corresponding name
            boolean found = false;
            for (int i = 0; i < numCourses; i++) {
                if (codes[i].equals(courseCode)) {
                    System.out.println("Course Name: " + names[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Course code not found.");
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
