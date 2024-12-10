package Q5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class L7Q5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream object = new ObjectInputStream(new FileInputStream("C:\\Users\\zhenx\\Documents\\Github_vscode\\WIX1002\\Lab7\\Q5\\person.dat"));

            int totalRecords = object.readInt();

            // Create a fixed-size array to hold the person data
            String[][] persons = new String[totalRecords][3];

            // Read each record (Name, Age, Gender)
            for (int i = 0; i < totalRecords; i++) {
                // Read the name (UTF format)
                String name = object.readUTF();
                // Read the age (int)
                int age = object.readInt();
                // Read the gender (char)
                char gender = object.readChar();

                // Store each person as a string array [name, age, gender]
                persons[i][0] = name;               // Name
                persons[i][1] = Integer.toString(age); // Age as a String
                persons[i][2] = Character.toString(gender); // Gender as a String
            }

            // Close the object input stream
            object.close();

            // Sort the array of persons by name in ascending order
            for (int i = 0; i < persons.length - 1; i++) {
                for (int j = 0; j < persons.length - i - 1; j++) {
                    if (persons[j][0].compareTo(persons[j + 1][0]) > 0) {
                        // Swap the elements
                        String[] temp = persons[j];
                        persons[j] = persons[j + 1];
                        persons[j + 1] = temp;
                    }
                }
            }

            // Display the sorted persons
            for (int i = 0; i < totalRecords; i++) {
                System.out.println("Name: " + persons[i][0] + ", Age: " + persons[i][1] + ", Gender: " + persons[i][2]);
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
