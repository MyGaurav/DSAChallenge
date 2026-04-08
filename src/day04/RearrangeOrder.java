package src.day04;

import java.util.Arrays;

public class RearrangeOrder {
    public static void main(String[] args) {
        int[] arr={3,2,1,4,7,6,5};
        rearrangeOrder(arr);
        for(int num:arr){
            System.out.print(num +" ");
        }
//        System.out.println(Arrays.toString(arr));
    }

    private static void rearrangeOrder(int[] arr) {

        Arrays.sort(arr);
        int mid=(arr.length-1)/2;
        int end = arr.length-1;
        while(mid<end){
            int temp = arr[mid];
            arr[mid] = arr[end];
            arr[end]=temp;
            mid++;
            end--;
        }
    }
}
