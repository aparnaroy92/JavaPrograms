import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = sc.nextInt();
        int fib[]=new int[x];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<x; i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        for(int i=0; i<x; i++){
            System.out.print(fib[i]+"\t");
        }
    }
    
}
