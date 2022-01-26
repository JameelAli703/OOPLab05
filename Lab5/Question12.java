package Lab5;

public class Question12 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int sum=0;
        float average =0;
        for(int i=1; i<=15; i++){
            sum=sum+i;
            average = sum/15;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Average ="+average);

    }
}
