import java.util.*;
public class ArrayTopic {
    public static void array(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        //passing an array as argument
        int marks[]={99,98,100};
        array(marks);
        //print our array
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}

//result-- [100,99,101]
//this shows the array passes the value as reference.