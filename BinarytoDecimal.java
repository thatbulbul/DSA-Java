import java.util.*;
public class BinarytoDecimal {

    //binary to decimal
    public static void binToDec(int num){
        int pow=0;
        int dec=0;
        while(num>0){
            int lastDigit=num%10;
            dec=dec+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            num=num/10;
        }
        System.out.println("The decimal of given number is:"+dec);
    }
    public static void main(String args[]){
        int num=1000;
        binToDec(num);
    }
}
