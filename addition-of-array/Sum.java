import java.util.Arrays;

class Sum{
  public static void main(String[] args){
    int[] arr = {10,20,30,40,50};
    int sum = 0;

    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }

    System.out.println(String.format("Sum of %s is %d.", Arrays.toString(arr), sum));
  }
}
