import java.util.*;
public class LinearSearch {

    public static int Linear(int numb[], int key){
        for(int i=0;i<numb.length;i++){
            if(numb[i]==key){
               return i; 
            }
        }
        return -1;
    }
    public static void main(String args[]){
        //create an array
        int arr[]={1,2,3,4,5,6,7,8};
        int key=1;
       int index= Linear(arr, key);
       if(index==-1){
        System.out.println("Key is not found");
       }
       else{
        System.out.print("key is at the location of "+ index);
       }
    }
}

//time complecity proportional to loop , ie O(n).