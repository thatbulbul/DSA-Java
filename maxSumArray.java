public class maxSumArray {
    public static void MaxSum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("the max sum is :"+maxSum);
    }
    public static void main(String args[]){
        int arr[]={5,4,-1,7,8};
        MaxSum(arr);
    }
}
