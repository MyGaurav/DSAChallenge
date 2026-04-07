package src.day04;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={10,3,5,5,2,4};
        reverseArray(arr);
        for(int num :arr){
            System.out.print(num+" ");
        }
    }

    private static void reverseArray(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int start =0,end=arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
