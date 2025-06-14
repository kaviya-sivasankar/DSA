import java.io.*;

import java.util.*;

// Read only region start

class UserMainCode

{

public int digitSum(int input1) {

// Read only region end I

// Write code here...

boolean isNegative = input1 < 0;

input1 = Math.abs(input1);

while(input1 >= 10){

int sum = 0;

while(input1 > 0){

int digit = input1 % 10;

sum += digit;


input1 /= 10;

}

input1 = sum;

}

return isNegative ? -input1: input1;
}
}
