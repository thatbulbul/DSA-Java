import java.util.*;

public class functions {
    // for calculating sum
    public static void calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("the sum of the two given numbers is:" + sum);
    }

    // Java is strictly call by value--- the value doesn't change.
    // swap the values
    public static void swapValue(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("the value of a"+a);
        System.out.println("the value of b"+b);
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // calculateSum(a, b);
        int a=10;
        int b=11;
        swapValue(a, b);
        System.out.println("the old value"+a);
        System.out.println("the old value"+b);
    }

}
