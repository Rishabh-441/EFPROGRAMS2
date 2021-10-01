package practice_questions1;

import java.util.Scanner;

class FindIndex{
    int arr[];

    public void setArr(int...arr) {
        this.arr = arr;
    }

    int fromIndex(){
        int ind_6 = -1;
        int ind_7 = -1;
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == 6) ind_6 = i;
            if (arr[i] == 7) ind_7 = i;
        }
        if ((ind_6 < ind_7) &&( ind_6!=-1 )) {
            int i =0;
            while(i<arr.length){
                if (arr[i]==6){
                    i+=ind_7-ind_6+1;
                }
                else {
                    sum+=arr[i];
                    i++;
                }
            }
        }
        return sum;
    }
}

public class IndexSum {
    public static void main(String[] args) {
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements: ");
        int n = sc.nextInt();

        arr = new int[n];
        System.out.print("enter the elements of array: ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        FindIndex obj = new FindIndex();
        obj.setArr(arr);
        System.out.println(obj.fromIndex());
    }
}
