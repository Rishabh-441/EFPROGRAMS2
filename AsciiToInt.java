package practice_questions1;

import java.util.Scanner;

public class AsciiToInt {
    public static void main(String[] args) {
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no.of elements in array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("enter the elements of array: ");
        for (int i = 0 ; i < arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i < arr.length ;i++ ){
            System.out.println((char)arr[i]);
        }
    }
}
