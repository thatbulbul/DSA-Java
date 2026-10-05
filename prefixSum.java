public class prefixSum {

    public static int Sum(int nums[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        // Prefix array
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Find maximum subarray sum
        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {

                if (i == 0) {
                    currSum = prefix[j];
                } else {
                    currSum = prefix[j] - prefix[i - 1];
                }

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String args[]) {

        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(Sum(nums));
    }
}