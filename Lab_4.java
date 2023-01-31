class Lab_4 {
  public static void main(String[] args) {
    int[] array = {5, 15, 35, 65, 20};
    int sum = 0;
    float average;

    for (int i = 0; i < 5; i++) {
      sum += array[i];
    }

    average = sum / 5;
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }
}
