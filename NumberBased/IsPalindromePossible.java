import java.io.*;

import java.util.*;

// Read only region start

class UserMainCode

{

public int isPalinNumPossible(int input1){

// Read only region end

// Write code here...
  int[] DigitCount = new int[10];

        while(input1 > 0){
            int temp = input1 % 10;
            DigitCount[temp]++;
            input1 /= 10;
        }
        int oddvalueCount = 0;
        for(int i = 0; i< 10; i++){
            if(DigitCount[i] % 2 != 0){
                oddvalueCount++;
            }
        }
        if(oddvalueCount<= 1){
            return 2;
        }
        return 1;
		//throw new UnsupportedOperationException("isPalinNumPossible(int input1)");
	}
}
