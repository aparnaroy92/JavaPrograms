public class sumOfDigits {
    int total = 0;
   /* Method 1: without recursive call 
    public int sum(int x){
        while(x != 0){
            total += (x%10);
            x = x/10;
        }
        return total;
    }*/
    //Method 2:Recursive call
    public int sum(int x){
        if(x==0)
            return total;
        else{
            total += (x%10);
            sum(x/10);
        }
        return total;
    }
    public static void main(String[] args) {
        sumOfDigits s =new sumOfDigits();
        System.out.println("sum:"+s.sum(123));
    }
}