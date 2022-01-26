package Lab5;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size: ");
        size = scanner.nextInt();
        System.out.println("Enter the number :");
        int array[] = new int[size];
        int i = 0;
        int element = 0;
        while (i < size) {
            element = scanner.nextInt();
            if (element > 20) {
                array[i] = element;
                i++;
            }
        }
        System.out.println("Repeated number are ");
        for (int j = 0; j < array.length - 1; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] == array[k]) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}
