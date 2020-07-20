package testphone;

import java.util.Scanner;
import java.io.*;

public class TestPhone {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = null;

        do {
            System.out.println("Give the phone number(7 digits): ");
            input = scan.next();
        } while (input.length() != 7);

        Phone allPhoneWords = new Phone();
        String output = allPhoneWords.findAllWords(input);

        try {
            FileWriter f = new FileWriter("output.txt");
            BufferedWriter b = new BufferedWriter(f);
            b.write(output);
            b.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
