package Q2;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class L7Q2 {
    public static void main(String[] args) {
        try {             
            URI uri = new URI("http://fsktm.um.edu.my");   
            URL u = uri.toURL();          
            URLConnection cnn = u.openConnection();             
            InputStream stream = cnn.getInputStream();             
            Scanner in = new Scanner(stream); 
            
            FileWriter writer = new FileWriter("index.htm");
            while (in.hasNextLine()) {
                String line = in.nextLine();
                writer.write(line + System.lineSeparator());
            }
            in.close();
            writer.close();

            System.out.println("Web page saved as index.htm");
        } catch (IOException e) {             
            System.out.println("IO Error:" + e.getMessage());         
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
