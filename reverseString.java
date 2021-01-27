import java.util.Scanner;
public class reverseString {
    String s = "";
    public String reverse(String x)
        {
            if(x.length()==1)
                return x;
            else{
                s += x.charAt(x.length()-1)+reverse(x.substring(0, x.length()-1));
                return s;
            }
        }
    public static void main(String[] args) {
        reverseString obj =new reverseString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        System.out.println("String after reversal :"+obj.reverse(sc.next()));

    } 
}
