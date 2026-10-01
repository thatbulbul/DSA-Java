import java.util.*;
public class Array {
    public static void main (String args[]){
        //input in array

        int marks[]=new int[10];

        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        System.out.println("the maths marks are"+marks[0]);
        System.out.println("the science marks are"+marks[1]);
    }
}
