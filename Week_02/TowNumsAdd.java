package homework;

public class TowNumsAdd {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0;i < nums.length - 1;i ++) {
            int b = target  - nums[i] ;
            for (int j = i + 1 ;j <= nums.length - 1; j ++) {
                if (b == nums[j]) {
                    arr[0] = i;
                    arr[1] = j;
                    return  arr;
                }
            }
        }
        return null;
    }
}
