package src.day04;

public class FindLargestNum {
    public static void main(String[] args) {
        int[] arr ={10,3,5,5,2,4};
        int largest = largestNumInArray(arr);
        System.out.println(arr[largest]);
    }

    private static int largestNumInArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max =0;
        for(int i =1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}

