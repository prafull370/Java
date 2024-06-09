import java.io.*;
import java.util.Scanner;

public class ByteStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "new.txt";

        try {
            // Accepting a string from the user
            System.out.print("Enter a string to save to the file: ");
            String inputString = scanner.nextLine();

            // Saving the string to the file using FileOutputStream
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                fos.write(inputString.getBytes());
            }

            // Reading the string from the file using FileInputStream
            StringBuilder stringBuilder = new StringBuilder();
            try (FileInputStream fis = new FileInputStream(filePath)) {
                int content;
                while ((content = fis.read()) != -1) {
                    stringBuilder.append((char) content);
                }
            }

            // Displaying the string read from the file
            System.out.println("The string read from the file is: " + stringBuilder.toString());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
