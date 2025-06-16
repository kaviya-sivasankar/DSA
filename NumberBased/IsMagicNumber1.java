class Main {
    public static void main(String[] args) {
     
      System.out.println(magicNoCheck(50113));
       
    }
   
    public static int magicNoCheck(int num){
       
       while (num > 9){

           int sum = 0;
           while(num > 0){
               sum += num % 10;
               num /= 10;
           }
           num = sum;
       }
        if(num == 1){
            return 1;
        }
        return 0;
         }  
       
       
   
}
