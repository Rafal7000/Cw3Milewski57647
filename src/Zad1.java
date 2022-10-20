import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
public class Zad1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Zad.1:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float firstNumberMilewski;
        float secondNumberMilewski;
        System.out.println("Podaj pierwszą liczbę ");
        firstNumberMilewski = Float.parseFloat(br.readLine());
        System.out.println("Podaj drugą liczbę ");
        secondNumberMilewski = Float.parseFloat(br.readLine());

        System.out.println("Wynik Dodawania to " + String.format("%.2f",(firstNumberMilewski + secondNumberMilewski)));
        System.out.println("Wynik Odejmowania to " + String.format("%.2f",(firstNumberMilewski - secondNumberMilewski)));
        System.out.println("Wynik Mnożenia to " + String.format("%.2f",(firstNumberMilewski * secondNumberMilewski)));
        System.out.println("Wynik Dzielenia to " + String.format("%.2f",(firstNumberMilewski / secondNumberMilewski)));



    }
}
