// Read only region start

class UserMainCode

{

public int EvenOddDigitsSum(int input1, String input2){

// Read only region end

// Write code here...

int sum = 0;

while(input1 > 0){ I

int digit input1 % 10;

if(input2.equals("odd") && digit % 2 != 0) {

sum += digit;

}

else if(input2.equals("even") && digit % 2 == 0){
sum += digit;

}

input1 /= 10;

}

return sum;
}
}
