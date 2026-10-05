public class BinarySearch {

    public static int Binary(int arr[],int key){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            //condition
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){ //right
                start=mid+1;
            }
            else{//left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6};
        int key=6;

        System.out.println("the index for the key is :"+ Binary(array, key));
    }
}
