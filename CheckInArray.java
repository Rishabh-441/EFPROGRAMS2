package practice_questions1;

import java.util.Scanner;

class ArrayForm{
    int[] arr;
    ArrayForm(int...nums){
        arr = nums;
    }

    public void check(int n){
        int i = 0;
        for (; i < arr.length ; i++ ){
            if (n==arr[i]){
                System.out.println("found**the number is at index no. "+ i);break;
            }
        }
        if (i==arr.length) System.out.println("-1");
    }
}
public class CheckInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        System.out.println("enter the no.of elements in arr: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("enter the elements of array: ");
        for (int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        ArrayForm a = new ArrayForm(arr);
        System.out.print("enter the number to find: ");
        int find = sc.nextInt();
        a.check(find);
    }
}
