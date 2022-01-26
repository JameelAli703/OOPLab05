package Lab5;

import java.util.Random;

public class Question6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(15);
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.print("the random numbers are : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=i;j<a.length;j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("the ascending numbers are : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i=0;i<a.length;i++){
            for (int j=i;j<a.length;j++){
                if (a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("the descending numbers are : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
