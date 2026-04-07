package src.day04;

import java.util.HashMap;

public class CountFreq {
    public static void main(String[] args) {
        int[] arr ={3,2,2,3,1,1,1,7,7,7};
        HashMap<Integer,Integer> map = new HashMap<>();
        countFreq(arr,map);
    }

    private static void countFreq(int[] arr, HashMap<Integer, Integer> map) {

        for(int num:arr){
            if(map.containsKey(num)){
                int count = map.get(num);
                map.put(num,count+1);
            }else{
                map.put(num,1);
            }
        }
        System.out.println(map.toString());

// mistake = keep reseting count, always should get the old count then add on it

//        i can also use map.getOrDefault method to return its count and if not then 0
//        for (int num : arr) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }

    }
}

