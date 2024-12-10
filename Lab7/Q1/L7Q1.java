package Q1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class L7Q1 {
    public static void main(String[] args) {
        String filename = "coursename.dat";

        String[] courseCodes = {"WXES1116", "WXES1115", "WXES1110", "WXES1112"};
        String[] courseNames = {"Programming I", "Data Structure", "Operating System", "Computing Mathematics I"};
    
        write(filename, courseCodes, courseNames);
    
        search(filename); 
    }
    
    public static void write(String filename, String[] courseCodes, String[] courseNames){
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))){
            outputStream.writeInt(courseCodes.length);
            for (int i = 0; i < courseCodes.length; i++){
                outputStream.writeUTF(courseCodes[i]);
                outputStream.writeUTF(courseNames[i]);
            }
            outputStream.close();
            System.out.println("Course data successfully updated");
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    } 

    public static void search(String filename){
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))){
            int num = inputStream.readInt();
            String[] localCourseCodes = new String[num];
            String[] localCourseNames = new String[num];
            for(int i = 0; i < num; i++){
                localCourseCodes[i] = inputStream.readUTF();
                localCourseNames[i] = inputStream.readUTF();
            }
            inputStream.close();
            Scanner input = new Scanner (System.in);
            System.out.print("Enter course code: ");
            String courseCode = input.next().toUpperCase();
            input.close();

            boolean found = false;
            for (int i = 0; i < num; i++){
                if (localCourseCodes[i].equals(courseCode)){
                    System.out.println("Course Name: " + localCourseNames[i]);
                    found = true;
                    break;
                }
            }
            if (!found){
                System.out.println("Course code not found.");
            }
            } catch (FileNotFoundException e){
                System.out.println("File was not found.");
            } catch (IOException e) {
                System.out.println("Error reading data: " + e.getMessage());
            }
    }
}
