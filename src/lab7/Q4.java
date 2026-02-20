package lab7;

import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            System.out.print("Enter file name: ");
            String filename = sc.nextLine();

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();

                String[] wordArray = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }
            }

            br.close();

            System.out.println("No. of characters: " + characters);
            System.out.println("No. of lines: " + lines);
            System.out.println("No. of words: " + words);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}