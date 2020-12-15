import javax.swing.text.AttributeSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("input3"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] path = new String[323];

        int count = 0;
        while (in.hasNext()){
            path[count] = in.nextLine();
            count++;
        }

        int trees = 0;
        int playerPosition = 0;
        for (int i = 0; i < path.length; i = i++) {
            String isTree = Character.toString(path[i].charAt(playerPosition));
            if (isTree.equals("#")) {
                trees++;
            }

            for (int a = 0; a < 3; a++) {
                playerPosition++;
                if (playerPosition == 31){
                    playerPosition = 0;
                }
            }

        }
        System.out.println(trees);
    }
}
