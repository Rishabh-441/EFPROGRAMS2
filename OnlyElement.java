package practice_questions1;

import java.util.Arrays;
import java.util.Scanner;

class Checking{
    int[] arr;
    public Checking(int...arr) {
        this.arr = arr;
    }

    boolean only14(){
        for(int i = 0 ; i < arr.length ; i++ ){
            if (arr[i] != 1 && arr[i] != 4){
                return false;
            }
        }
        return true;
    }
}
public class OnlyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        System.out.print("enter the number of elements:");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.print("enter the elements of the array:");
        for (int i = 0 ; i < arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Checking obj = new Checking(arr);
        System.out.println(obj.only14());
    }
}
