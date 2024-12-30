class Average{
  public static void main(String[] args){
    int ages[] = {21,32,35,26,25,34};
    float sum = 0, average = 0;

    int length = ages.length;

    for(int age : ages){
      sum += age;
    }

    average = sum / length;
    System.out.println(String.format("The average is : %.1f", average));
  }
}
