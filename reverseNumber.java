import java.util.Scanner;
public class reverseNumber {
    public int reverse(int num){
        int temp=0;
        while(num!=0){
            temp=(temp*10)+(num%10);
            num=num/10;
        }
        return temp;
    }
    public static void main(String[] args) {
        reverseNumber r = new reverseNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed:\n");
        int x = sc.nextInt();
        System.out.println("Number after reversing:"+r.reverse(x));
    }
}
