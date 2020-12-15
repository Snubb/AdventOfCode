import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("input4"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] ports = new String[1000];

        int count = 0;
        while (in.hasNext()){
            ports[count] = in.nextLine();
            count++;
        }

        System.out.println("1: " + ports[3]);
        if (ports[3].isEmpty()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

     }
}
