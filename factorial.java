import java.util.*;

public class factorial {
    // find the factorial of the number given by the user

    public static int factorialOf(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    // binomial coefficient
    public static void binomial(int n, int r) {
        int binomial = factorialOf(n) / (factorialOf(n - r) * factorialOf(r));
        System.out.println(binomial);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the value of n");
        int n = sc.nextInt();
        System.out.println("write the value of r");
        int r = sc.nextInt();
        binomial(n, r);
    }
}
