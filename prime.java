import java.util.Scanner;
public class prime {
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1 | num % 2 == 0)
            return false;
        for (int i = 3; i < num / 2; ++i)
            if (num % i == 0)
                return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if odd or even?:");
        int x = sc.nextInt();
        if (isPrime(x))
            System.out.println("It is prime number\n");
        else
            System.out.println("It is not a prime number\n"); 
    }
}

