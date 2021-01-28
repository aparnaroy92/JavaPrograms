public class decimalToBinary {
    public static void main(String[] args) {
        int binary[] = new int[25];
        int number = 4;
        int i = 0;
        while (number > 0){
                binary[i++] = number%2;
                number = number/2; 
            }
        for(int j = i-1; j >= 0; j--){
            System.out.print(binary[j]);
        }
        System.out.println("\n");

    }
}

