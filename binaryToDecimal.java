import java.lang.Math;
public class binaryToDecimal {
    public int convertBinary(int x){
        int result = 0;
        int i = 0;
        while (true)
        {
            if(x==0){
                break;
            } 
            else{
                result += (x%10)*Math.pow(2, i);
                x = x/10;
                i++;
            } 
        }
        return result;
    }
    public static void main(String[] args) {
        binaryToDecimal bc = new binaryToDecimal();
        System.out.println(bc.convertBinary(100));
        
    }
}
