import java.util.Scanner;
class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        System.out.println("Calculator");
        System.out.println("Enter your choice :");
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
        int i = sc.nextInt();
        System.out.println("Enter the 1st number:");
        int a =sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b=sc.nextInt();
        switch(i){
            case 1: 
                result = a+b;
                break;
            case 2:
                result = a-b;
                break;
            case 3:
                result = a*b;
                break;
            case 4:
                result = a/b;
                break;
            default:
                return;
        }
        System.out.println("Result :" + result);
    }
}