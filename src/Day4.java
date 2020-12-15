import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day4 {
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


        String currentPort = "";
        int validPorts = 0;
        int valid;
        String compare;
        for (int i = 0; i < ports.length; i++){
            if (ports[i].isEmpty()) {
                if (currentPort.contains("byr") && currentPort.contains("iyr") && currentPort.contains("eyr") && currentPort.contains("hgt") && currentPort.contains("hcl") && currentPort.contains("ecl") && currentPort.contains("pid")) {
                    valid = currentPort.lastIndexOf("byr");
                    //compare = ;


                    validPorts++;
                }
                currentPort = "";
            } else {
                currentPort = currentPort + ports[i];
            }
        }
        System.out.println("" + validPorts);
    }
}
