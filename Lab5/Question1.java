package Lab5;

public class Question1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int j, count = 1;
        {
            for (int i = 0; i < 10; i++) {
                System.out.print(count++);
                for (j = i; j < 9; j++) {
                    System.out.print(arr[j]);
                    if (j == 9) {
                        break;
                    }
                }
                System.out.println();
            }
        }

    }
}
