//Q. Solving that leetcode question only using List Interface rather than an ArrayList
import java.util.ArrayList;
import java.util.List;

public class Ist {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 8, 4};
        int extra = 1;

        List<Boolean> ist = candies(nums, extra);
        System.out.println(ist);
    }

    static List<Boolean> candies(int[] arr, int extraCandies) {
        List<Boolean> l1 = new ArrayList<>(arr.length);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            l1.add(arr[i] + extraCandies >= max);
        }

        return l1;
    }
}
