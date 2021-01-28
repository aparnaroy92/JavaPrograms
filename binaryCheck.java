import java.util.Scanner;
public class binaryCheck {
    public boolean check(int x){
        boolean status = true;
        while(true){
            if(x == 0)
                break;
            else{
                if(x%10 > 1){
                status = false;
                break;
                }
                x = x/10;
            }
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        binaryCheck bc = new binaryCheck();
        System.out.println("Enter a number to check if binary or not:");
        int x = sc.nextInt();
        if(bc.check(x))
            System.out.println("It is boolean!");
        else
            System.out.println("It is not boolean!");
    }
    
}
