public int uniqueDigitsCount(int input1){

// Read only region end

// Write code here...

boolean[] seen = new boolean[10];

int count = 0;

while(input1 > 0){

int digit = input1 % 10;

if(!seen[digit]){

seen [digit] = true;

count++;

}

input1 /= 10;

}

return count;

}
}
