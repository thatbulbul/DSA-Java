import java.util.*;
public class primerange {
    //print the prime range to n
    public static void primeCount(int num){
        for(int i=2;i<num;i++){
            Boolean isPrime=prime.primeNumber(i);
            if(isPrime==true){
                System.out.println(i);
            }
        }
    }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("write the number from which you want to find the range");
            int num=sc.nextInt();
            primeCount(num);
    }
}
