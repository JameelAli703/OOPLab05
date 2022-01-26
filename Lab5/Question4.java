package Lab5;

public class Question4 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,9,8,8,7,6,5,4,3,2,1};
        for (int i=0; i<8; i++){
            if (a[i]==a[15-i]){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }

    }
}
