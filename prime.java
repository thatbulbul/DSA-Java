import java.util.*;
public class prime {

    //if the number is prime or not 
    public static Boolean primeNumber(int n){
       Boolean isPrime=true;
       if(n<=1){
        isPrime=false;
       }
       else{
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
       }
       return isPrime;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("write the number you want to check for prime number:");
        int n=sc.nextInt();
        Boolean isPrime=primeNumber(n);
        if(isPrime==true){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
}
