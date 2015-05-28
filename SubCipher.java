import java.lang.*;
import java.io.*;
import java.util.*;

public class SubCipher {

    public static String chars = "abcdefghijklmnopqrstuvwxyz";
    public static String cryptList = "kngcadsxbvfhjtiumylzqropwe";

    public static void main(String args[]) {
        Console console = System.console();

        System.out.println("Select an option\n1. Decrypt a file\n2. Encrypt a file\n");

        String input = console.readLine("1 or 2; ");
        int input1 = Integer.parseInt(input);
        String inputFileName = console.readLine("Enter input file name: ");
        String outputFileName = console.readLine("Enter output file name: ");

        if(input1 == 1) {
            decrypt(inputFileName, outputFileName);
        }
        if(input1 == 2) {
            encrypt(inputFileName, outputFileName);
        }
    }

    public static void decrypt(String inputFile, String outputFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("cipher.txt"));
            FileWriter fw = new FileWriter("output.txt");
            

            String line = null;
            while ((line = br.readLine()) != null) {
                String newLine = "";
                for(int i = 0; i < line.length(); i++) {
                    char in = line.charAt(i);
                    int index = chars.indexOf(in);
                    char out = cryptList.charAt(index);
                    newLine += out;
                }
                fw.write(newLine);
            }

            br.close();
            fw.close();
        }
        catch(Exception e){
            System.out.println("An unknown error occurred, please try again");
        }
    }

    public static void encrypt(String inputFile, String outputFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter fw = new FileWriter(outputFile);


            String line = null;
            while ((line = br.readLine()) != null) {
                String newLine = "";
                for(int i = 0; i < line.length(); i++) {
                    char in = line.charAt(i);
                    int index = cryptList.indexOf(in);
                    char out = chars.charAt(index);
                    newLine += out;
                }
                fw.write(newLine);
            }

            br.close();
            fw.close();
        }
        catch(Exception e){
            System.out.println("An unknown error occurred, please try again");
        }
    }
}