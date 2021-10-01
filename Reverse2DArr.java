package practice_questions1;

import java.util.Arrays;




public class Reverse2DArr {
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        int c = 0;
        for (int i = 0 ; i < 2 ; i++ ){
            for (int j = 0 ; j < 2 ; j++ ){
                arr[i][j] = Integer.parseInt(args[c]);
                c++;
            }
        }
        Arr2D obj = new Arr2D(arr);
        obj.reverse();
        for(int i = 0 ; i < arr.length ; i++ ){
            for(int j = 0 ; j < arr[i].length ; j++ ){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("\n");
        }



    }

}
class Arr2D{
    int arr[][];
    Arr2D(int[][] arr){
        this.arr = arr;
    }

    void reverse(){
        int[] arr0 = arr[1];
        arr[1] = arr[0];
        arr[0] = arr0;
    }

}