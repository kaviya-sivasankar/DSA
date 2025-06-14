class UserMainCode

{

public int EvenDigitsSum(int input1){

// Read only region end

// Write code here...

int sum = 0;

while(input1 > 0){

int digit input1 % 10;

if(digit % 2 == 0){

sum += digit;

I}

input1 /= 10;

}
return sum;
}
}
