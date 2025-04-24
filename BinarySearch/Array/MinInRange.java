package Array;

// minimum value in an array

public class MinInRange{

    public static void main(String[] args){
    
    int[] arr = {4,7,9,8,1};
    
    System.out.println(minArray(arr));
    
    }
    
    static int minArray(int[] arr){
    
    int min = arr[0];
    
    for(int index = 1; index < arr.length ; index++){
    
    if(arr[index] < min ){
    
    min = arr[index];
    
    }
    
    }
    return min;
    
    
    }
    
    }
