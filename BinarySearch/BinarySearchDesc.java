public class BinarySearchDesc {
    
    public static void main(String[] args){
    int [] arr = {9,8,5,4,3,2,1};
     int target = 8;
    System.out.println(binDesc(arr, target));
    }
    
    static int binDesc(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
    
        while(start <= end){
            int mid = start + (end-start)/2;
    
    if(target < arr[mid]){
        start = mid + 1;
    }
    else if(target > arr[mid]){
        end = mid -1;
    }
    else 
     return mid;
     
        
        }
    return -1;
    
        }
    }
    
    
    
    
    
