package Lab5;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,6};
        System.out.println("Enter any Number ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a != arr1[4]) {
            System.out.println("Not Present in Array");
        } else { // arr1[4]=index of total number of elements
            System.out.println("Present in Array");
        }

    }
}
