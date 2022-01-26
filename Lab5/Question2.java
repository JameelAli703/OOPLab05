package Lab5;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        double arr1[]={1.11,2.22,3.33,4.44,5.55,6.66,7.77,8.88,9.99,10.88};
        double arr2[]= Arrays.copyOf(arr1,10);
        arr2[0]++;
        System.out.println("Contents of arr1[]=");
        for(int i=0; i< arr1.length; i++ ){
            System.out.print(" "+arr1[i]+" ");
        }
        System.out.println("\n\nContents of arr2[]=");
        int i;
        for(i = 9; i>=0; i--){
            System.out.print(" "+arr2[i]+" ");
        }

    }
}
