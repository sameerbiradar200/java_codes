package learnException;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
