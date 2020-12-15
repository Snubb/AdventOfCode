import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("input1"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[] tal = new int[200];

        int count = 0;
        while (in.hasNext()){
            tal[count] = in.nextInt();
            count++;
        }


        int tal1 = 0;
        int tal2 = 0;
        int resultat = 0;
        int a = 0;
        for (int i = 0; i < tal.length; i++){
            tal1 = tal[i];
            for (a = 0; a < tal.length; a++){
                tal2 = tal[a];
                    for (int b = 0; b < tal.length; b++){
                        resultat = tal1 + tal2 + tal[b];
                        if (resultat == 2020){
                            System.out.println(tal1);
                            System.out.println(tal2);
                            System.out.println(tal[b]);
                            System.out.println(tal1 * tal2 * tal[b]);
                            break;
                        }
                    }
                    //System.out.println(tal1);
                    //System.out.println(tal[a]);
                    //System.out.println(tal1*tal[a]);

            }
            //System.out.println(tal1);
            //System.out.println(tal[a]);
            //System.out.println(tal1*tal[a]);
        }

    }
}
