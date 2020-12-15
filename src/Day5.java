import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("input5"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] ids = new String[927];

        int count = 0;
        while (in.hasNext()){
            ids[count] = in.nextLine();
            count++;
        }

        int beginning = 0;
        int end = 127;

        for (int i = 0; i < ids.length; i++) {
            beginning = 0;
            end = 127;
            String row = ids[i].substring(0,7);
            for (int a = 0; a < row.length(); a++) {
                if (ids[a].equals("B")) {

                }
            }
        }

    }
}
