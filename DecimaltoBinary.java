import java.util.*;
public class DecimaltoBinary {
    //Decimal to Binary
    public static void decToBin(int num){
        int rem=0;
        int pow=0;
        int binNum=0;
        while(num>0){
            rem=num%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            num=num/2;
            pow++;
        }
        System.out.println("the Binary of the given number is :"+binNum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        decToBin(num);
    }
}
