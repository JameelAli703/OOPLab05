package Lab5;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        double arr1[]={1.11,2.22,3.33,4.44,5.55,6.66,7.77,8.88,9.99,10.10,
                11.11,12.12,13.13,14.14,15.15,16.16,17.17,18.18,19.19,20.20};
        int count = 0, copy=0;
        System.out.println("Enter No: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        for(int i =0; i<arr1.length; i++){
            if(a==arr1[i]){
                count =1;
                copy=i; break;
            } else{
                count=0;
            }
        }if (count==1){
            System.out.println("Index of the number is : "+copy);
        }else {
            System.out.println("The Number does not exist");
        }

    }
}
