public int nonRepeatDigitsCount(int input1){

// Read only region end

// Write code here...

boolean[] seen = new boolean[10];

boolean[] repeated new boolean [10];

int count = 0;

while(input1 > 0){

int digit input1 % 10;

if(!seen [digit]){

I

seen [digit] = true;

}

else {

repeated [digit]= true;

} input1 = 10;

}

for(int i=0; i< 10; i++) {

if(seen[i] && ! repeated[i]){

count++;

}

return count; 

}

}
