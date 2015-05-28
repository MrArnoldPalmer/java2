import java.lang.*;
import java.io.*;

public class Insurance {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
     
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] split = line.split("\\s+");
                // for(int i = 0; i < split.length; i++)
                //     System.out.println(split[i]);
                String fn = split[0];
                String ln = split[1];
                int age = Integer.parseInt(split[2]);

                double yearlyRate;

                if(age > 16 && age < 19)
                    yearlyRate = (1000 * .15) + 1000;
                else if(age > 20 && age < 25)
                    yearlyRate = (1000 * .05) + 1000;
                else if(age > 25)
                    yearlyRate = 1000 - (1000 * .1);
                else {
                    yearlyRate = 0;
                    System.out.println("This person isnt eligible for insurance");
                }

                System.out.println("Name: " + fn + " " + ln + ", Age: " + age + "\n" + "Yearly Rate: " + Double.toString(yearlyRate) + "\n");
            }
         
            br.close();
        }
        catch(Exception e){
            System.out.println("An unknown error occurred, please try again");
        }
    }
}