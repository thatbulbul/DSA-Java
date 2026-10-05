public class Kadane {
    public static int kadaneAlgo(int nums[]){
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < nums.length; i ++) {
            cur += nums[i];
            max = Math.max(cur, max);

            if (cur < 0) {
                cur = 0;
            }
        }

        return max;
    }
    public static void main(String args[]){
        int nums[]={5,4,-1,7,8};
        System.out.println(kadaneAlgo(nums));
    }
}
