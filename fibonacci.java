import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:\n");
        int x = sc.nextInt();
        int fib1 =0, fib2=1;
        int fib3;
        System.out.print("Fibonacci Series :" + fib1 +"->"+fib2);
        for(int i=2;i<=x;i++)
        {
            fib3 = fib1+fib2;
            fib1 = fib2;
            fib2 = fib3;
            System.out.print("->"+fib3);
        }
        System.out.println("\n");


    }
    
}
