public class RearrangeNumInOddSeq {
    public static void main(String[] args){
        int num = 361589;   // output:315968 

       
        String str = String.valueOf(num);
   String odd ="";
   String even ="";
        for(int i = 0;i< str.length(); i++){
            char ch = str.charAt(i);
            int digit = ch - '0';   // only for '0' - '9'char
            if(digit % 2 != 0){
                odd += digit;
            }
            else {
                even += digit;
            }
        }
        System.out.println(odd + even);
    }
}
