public class BinarySearch {
    

    public static void main(String[] args){
    //ascending order
        int[] arr = { 1,2,4,5,6,7,8};
        int target = 6;
    
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    
    }
    
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
    
    // to find middle element 
    //int mid = start + (end-start)/2;
    while(start <= end){
        int mid = start + (end-start)/2;
    if(target > arr[mid]){
    
    start = mid + 1;
    }
    else if(target < arr[mid]){
        end = mid - 1;
    }
    else
     return mid;
    }
    return -1;
    }
    }
    