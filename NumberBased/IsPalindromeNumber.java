import java.io.*;

import java.util.*;

// Read only region start

class UserMainCode

{

public int isPalinNum(int input1){

// Read only region end

// Write code here. T.

int original = input1;

int reverse = 0;

while(input1 >= 1 && input1 <= 25000){

int rem input1 % 10;

reverse = reverse*10 + rem;

input1/= 10;

if(reverse == original) {
return 2;

}

return 1;

}

}
