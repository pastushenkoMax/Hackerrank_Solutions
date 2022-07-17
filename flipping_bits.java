public class flipping_bits {
    public static long flippingBits(long n) {
        // Write your code here
        String long_to_byte = String.format("%32s", Long.toBinaryString(n)).replaceAll(" ", "0"); 
        String flip_byte = "";
        for(int i = 0; i < long_to_byte.length(); i++){
            if(long_to_byte.charAt(i) == '0'){
                flip_byte += '1';
            } else {
                flip_byte += '0';
            }
        }
        long x = Long.parseLong(flip_byte,2);
        return x;
        }
    public static void main(String[] args){
        long n = 77;
        System.out.println(flippingBits(n));
    }
}
