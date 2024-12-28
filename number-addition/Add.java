import java.util.Scanner;

class Add{
  public static void main(String[] args){
    Scanner txt = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = txt.nextInt();

    System.out.print("Enter second number: ");
    int num2 = txt.nextInt();

    int result = num1 + num2;
    System.out.println(String.format("%d + %d = %d.", num1,num2,result));

  }
}
