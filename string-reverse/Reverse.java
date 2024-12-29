import java.util.Scanner;

class Reverse{
  public static void main(String[] args){
    System.out.print("Enter a text: ");
    Scanner txt = new Scanner(System.in);

    String originalStr = txt.nextLine();
    String reversedStr = "";

    for(int i = 0; i < originalStr.length(); i++){
      reversedStr = originalStr.charAt(i) + reversedStr;
    }

    System.out.println(reversedStr);
    txt.close();
  }
}
