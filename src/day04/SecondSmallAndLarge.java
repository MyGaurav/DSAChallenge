package src.day04;

public class SecondSmallAndLarge {
    public static void main(String[] args) {
        int[] arr ={5};
        if (arr.length < 2) {
            System.out.println(("there is no second element"));
            return;
        }
        int secLargest = secondLargestNumInArray(arr);
        System.out.println(arr[secLargest]);
        int secSmallest = secondSmallestNumInArray(arr);
        System.out.println(arr[secSmallest]);
    }

    private static int secondLargestNumInArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max =0 ,secMax=0;
        for(int i =1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                secMax=max;
                max=i;
            }else if(arr[i]>arr[secMax] && arr[i] != arr[max]){
                secMax=i;
            }

        }
        return secMax;
    }
    private static int secondSmallestNumInArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int min =0 ,secMin=0;
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[min]){
                secMin=min;
                min=i;
            }else if(arr[i]<arr[secMin] && arr[i] != arr[min]){
                secMin=i;
            }

        }
        return secMin;
    }

}