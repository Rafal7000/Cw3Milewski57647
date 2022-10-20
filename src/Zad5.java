import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
public class Zad5 {
    public static void main(String[] args) throws IOException {


       Random rnd = new Random();
       int i = 0;
       int[] tab = new int[10];
       while (i < tab.length)
           {

           tab[i] = rnd.nextInt(1,100);
           i++;

           }
        int max = Arrays.stream(tab).max().getAsInt();
        int min = Arrays.stream(tab).min().getAsInt();
        System.out.println("Maksymalna wylosowana wartość to "+max);
        System.out.println("Minimalna wylosowana wartość to "+min);

        int j =0;
        while( j <tab.length) {
            System.out.println(tab[j]);
            j++;
        }







       }

    }












