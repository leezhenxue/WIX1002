package Q6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class L7Q6 {
    public static void main(String[] args) {
        try {
            Scanner inputProductNum = new Scanner (new FileInputStream("C:\\Users\\zhenx\\Documents\\Github_vscode\\WIX1002\\Lab7\\Q6\\product.txt"));
            int productNum = 0;
            while (inputProductNum.hasNextLine()) {
                productNum++;
                inputProductNum.nextLine();
            }
            inputProductNum.close();

            Scanner inputProduct = new Scanner (new FileInputStream("C:\\Users\\zhenx\\Documents\\Github_vscode\\WIX1002\\Lab7\\Q6\\product.txt"));
            Scanner inputOrder = new Scanner (new FileInputStream("C:\\Users\\zhenx\\Documents\\Github_vscode\\WIX1002\\Lab7\\Q6\\order.txt"));
            System.out.printf("%-15s%-25s%-15s%-15s%-15s\n", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");
            String[][] product = new String[productNum][3];
            for (int i = 0; i < productNum; i++) {
                product[i] = inputProduct.nextLine().split(",");
            }
            inputProduct.close();

            while (inputOrder.hasNextLine()) {
                String[] order = inputOrder.nextLine().split(",");
                System.out.printf("%-15s", order[1]);
                for (int i = 0; i < productNum; i++) {
                    if (product[i][0].equals(order[1])) {
                        System.out.printf("%-25s", product[i][1]);
                        System.out.printf("%-15d", Integer.parseInt(order[2]));
                        System.out.printf("%-15.2f", Double.parseDouble(product[i][2]));
                        System.out.printf("%-15.2f\n", (Integer.parseInt(order[2]) * Double.parseDouble(product[i][2])));
                    }
                }
            }
            inputOrder.close();
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
