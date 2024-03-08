import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println("Enter the option 1:Interger sorting, 2: String sorting: ");

        int arr[] = { 3, 4, 2, 9, 1 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        String arr1[] = { "Gayatri", "Mrunal", "Abhinav", "Jay" };
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j].compareTo(arr1[j + 1]) > 0) {
                    String temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        switch (option) {
            case 1:
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(" " + arr[i]);
                }
                break;
            case 2:
                for (int i = 0; i < arr1.length; i++) {
                    System.out.print(" " + arr1[i]);
                }
        }

    }

}
