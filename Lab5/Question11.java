package Lab5;

public class Question11 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]={11,12,13,14,15,16,17,18,19,20};
        int arr3[]=new int[10];
        for(int i=0; i<=9; i++){
            arr3[i]=arr1[i]+arr2[i];
            System.out.print(" "+arr3[i]);
        }
    }
}
