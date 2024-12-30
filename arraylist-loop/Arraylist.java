import java.util.ArrayList;
import java.util.Scanner;

class Arraylist{
  public static void main(String[] args){
    ArrayList<String> cars = new ArrayList<String>();
    Scanner input = new Scanner(System.in);

    for(int i = 0; i < 5; i++){
      System.out.print("cars[" + i + "]: ");
      cars.add(input.nextLine());
    }

    for(String car : cars){
      System.out.println(car);
    }
  }
}
