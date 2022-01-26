package Lab5;

import java.util.Random;

public class Question3 {
    public static void main(String[] args) {
        Random rand =new Random();
        int a[]=new int[10];
        for (int i=0; i<a.length; i++){
            a[i]=rand.nextInt(15);
            for (int j=0; j<i; j++){
                if (a[i]==a[j]){
                    i--;
                    break;
                }
            }
        }
        System.out.print("The Random numbers are: ");
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int max=a[0];
        for (int i=0; i<a.length; i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("maximum number = "+max);
        for (int i=0; i<a.length; i++){
            if (a[i]<max) {
                max = a[i];
            }
        }
        System.out.println("Minimum Number = "+max);
    }
}
