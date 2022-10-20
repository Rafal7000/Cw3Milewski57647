import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
public class Zad4 {
    public static void main(String[] args) {
        int i, parzyste = 0;

        for(i = 1; i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                parzyste = parzyste + i;
            }
        }
        System.out.println("Suma parzystych liczb od 1 do 100 wynosi "+ parzyste);
    }
}
