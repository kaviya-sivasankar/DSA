class Main {
    public static void main(String[] args) {
   
int num = 143;          // o/p : 341 using loop
int reverse =0;

while(num > 0){

    int digit = num % 10;
    reverse = reverse * 10 + digit;
    num /= 10;
}
    System.out.println(reverse);
    }
}
