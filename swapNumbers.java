public class swapNumbers {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.println("Before swapping :");
        System.out.println("x="+x);
        System.out.println("y="+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After swapping :");
        System.out.println("x="+x);
        System.out.println("y="+y);
        
    }
}
