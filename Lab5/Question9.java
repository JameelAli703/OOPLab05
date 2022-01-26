package Lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter index: " );
        size = scanner.nextInt();
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList(
                "maths", "pst", "chemistry","english","Joey") );
        System.out.println(namesList);
        namesList.remove(size);
        System.out.println(namesList);
    }
}
