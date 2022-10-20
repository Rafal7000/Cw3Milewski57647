import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
public class Zad2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Zad.2:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float heightMilewski;
        float weightMilewski;
        float BMI;
        System.out.println("Podaj wzrost w centymetrach ");
        heightMilewski = (Float.parseFloat(br.readLine())/100);
        System.out.println("Podaj wagę w kg ");
        weightMilewski = Float.parseFloat(br.readLine());
        BMI = (float)(weightMilewski/(Math.pow(heightMilewski,2)));

        if(BMI < 16.00)
        {
            System.out.println("Wygłodzenie " + "BMI Wynosi "+String.format("%.2f",BMI));
        }
        else if(BMI >=16.00 && BMI <= 16.99)
        {
            System.out.println("Wychudzenie "+ "BMI Wynosi "+String.format("%.2f",BMI));
        }
        else if(BMI >=17.00 && BMI <= 18.49)
        {
            System.out.println("Niedowaga "+ "BMI Wynosi "+String.format("%.2f",BMI));
        }
        else if(BMI >=18.50 && BMI <= 22.99)
        {
            System.out.println("Norma niski przedzał "+ "BMI Wynosi "+String.format("%.2f",BMI));
        }
        else if(BMI >=23.00 && BMI <= 24.99)
        {
            System.out.println("Norma wysoki przedzał "+ "BMI Wynosi "+String.format("%.2f",BMI));
        }
        else if(BMI >=25.00 && BMI <= 27.491)
        {
            System.out.println("Nadwaga niski przedział "+ "BMI Wynosi "+String.format("%.2f",BMI));
        }
        else if(BMI >=27.50 && BMI <= 29.99)
        {
            System.out.println("Nadwaga wysoki przedział "+ "BMI Wynosi "+String.format("%.2f",BMI));
        }
        else if(BMI >=30.00 && BMI <= 34.90)
        {
            System.out.println("Otyłość I stopnia "+ "BMI Wynosi "+String.format("%.2f",BMI));
        }
        else if(BMI >=35.00 && BMI <= 39.90)
        {
            System.out.println("Otyłość II stopnia "+ "BMI Wynosi "+String.format("%.2f",BMI));
        }
        else
        {
            System.out.println("otyłość III stopnia "+ "BMI Wynosi "+String.format("%.2f",BMI));
        }

    }
}
