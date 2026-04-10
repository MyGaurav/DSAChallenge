package src.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n=3;
        List<Boolean> list = kidsWithCandies(nums,n);
        System.out.print(list);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }

        }
        for (int n : candies) {
            if (max <= (n + extraCandies)) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}

