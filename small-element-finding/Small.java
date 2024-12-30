import java.util.Scanner;

class Small{
  public static void main(String[] args){
    System.out.print("Enter the size of array: ");
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();


    int[] arr = new int[size];

    for(int i = 0; i < size; i++){
      System.out.print(String.format("arr[%d]: ", i));
      arr[i] = input.nextInt();
    }

    int small = arr[0];

    for(int i : arr){
      if(i < small){
        small = i;
      }
    }

    System.out.println(String.format("Smallest element is: %d", small));
  }
}
