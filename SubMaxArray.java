public class SubMaxArray {
    public static void main(String args[]){
       int[] arr = {8, -4, 5, -3, 1, -2, -2};
       int max_far = Integer.MIN_VALUE;
       int max_end = 0;
       for(int i =0; i<arr.length; i++){
        max_end = max_end+arr[i];
        if(max_far < max_end){
            max_far = max_end;

        }
        if(max_end <0){
            max_end=0;
        }
       }
       System.out.println("The sum is : "+max_far); 
    }
}
