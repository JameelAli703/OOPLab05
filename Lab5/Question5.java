package Lab5;

public class Question5 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int b[]=new int[10];
        int c[]=new int[10];
        System.out.print("combined array : ");
        for (int i=0;i<16;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<8;i++){
            b[i]=a[i];
            c[i]=a[i+8];
        }
        System.out.print("elements in first array : ");
        for (int i=0;i<8;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.print("elements in second array : ");
        for (int i=0;i<8;i++){
            System.out.print(c[i]+" ");
        }
    }
}
