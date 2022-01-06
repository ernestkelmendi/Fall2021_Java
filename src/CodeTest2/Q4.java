package CodeTest2;

public class Q4 {
    public static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int partition(int[] nums)
    {
        int pIndex = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > 0)    {    // pivot is 0
                swap(nums, i, pIndex);
                pIndex++;
            }
        }

        return pIndex;
    }

    public static int findSmallestMissing(int[] nums)
    {
        int k = partition(nums);
        for (int i = 0; i < k; i++)
        {

            int val = Math.abs(nums[i]);

            if (val-1 < k && nums[val-1] >= 0) {
                nums[val-1] = -nums[val-1];
            }
        }

        for (int i = 0; i < k; i++)
        {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return k + 1;
    }

    public static void main(String[] args)
    {
        int[] nums = {3, 5, 1, 4, 2, 7};
        int[] nums2 = {2, 5, -1, 0, 6};
        int[] nums3 = {0, 5, -1, 1, 2, 5, 3, 7, 1, 2};
        int[] nums4 = {-2, -5, -1, -10, -6};

        System.out.println("The smallest positive missing number is " +
                findSmallestMissing(nums));
        System.out.println("The smallest positive missing number is " +
                findSmallestMissing(nums2));
        System.out.println("The smallest positive missing number is " +
                findSmallestMissing(nums3));
        System.out.println("The smallest positive missing number is " +
                findSmallestMissing(nums4));
    }
}
