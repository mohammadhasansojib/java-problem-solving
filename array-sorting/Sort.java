import java.util.Arrays;

class Sort{
  public static void main(String[] args){
    String[] arr = {"Volvo", "Mazda", "Mustang", "Ford", "BMW"};
    
    Arrays.sort(arr);

    for(String i : arr){
      System.out.println(i);
    }
  }
}
