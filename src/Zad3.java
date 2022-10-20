import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
public class Zad3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float a;
        float b;
        float c;
        float delta;
        float amountOfRoots;
        System.out.println("Obliczanie Pierwiastków równania kwadratowego");
        System.out.println("Wprowadź a");
        a = Float.parseFloat(br.readLine());
        System.out.println("Wprowadź b");
        b = Float.parseFloat(br.readLine());
        System.out.println("Wprowadź c");
        c = Float.parseFloat(br.readLine());
        delta = (float)Math.pow(b,2) - 4 * a * c;
        if (delta == 0)
        {
            amountOfRoots = 1;
        }else if(delta >0 )
        {
            amountOfRoots = 2;
        }else
            amountOfRoots = 0;



        switch ((int)a)
        {
            case 0:
            {
                System.out.println("Parametr a nie może się równać 0");
                break;
            }
            default:
            {
                System.out.println("Obliczanie równania");
                switch ((int) amountOfRoots)
                {
                    case 0:
                    { System.out.println("Równanie nie ma pierwiastków rzeczywistych");
                        break;
                    }
                    case 1:
                    { float x1;
                        x1 = -b/2*a;
                        System.out.println("Równanie ma dwa jeden pierwiastek i jest to "+ String.format("%.2f",x1));
                        break;

                    }
                    default:
                    {
                        double x1;
                        double x2;
                        x1  = (-b - Math.sqrt(delta))/(2*a);
                        x2  = (-b + Math.sqrt(delta))/(2*a);
                        System.out.println("Równanie ma dwa pierwiastki i jest to x1: "+  String.format("%.2f",x1) +
                                " oraz x2: "+ String.format("%.2f",x2 ));
                        break;

                    }

                }

            }

        }

    }
}
