package src.day04;

public class SmallestNumInArray {
    public static void main(String[] args) {
        int[] arr ={10,3,5,5,2,4,-33};
        int smallest = smallestNumInArray(arr);
        System.out.println(arr[smallest]);
    }

    private static int smallestNumInArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }
}
