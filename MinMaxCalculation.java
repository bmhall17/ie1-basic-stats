public class MinMaxCalculation {
  public static void main(String[] args) {
    int maxVal = Integer.MAX_VALUE;
    int minVal = Integer.MIN_VALUE;
    for(int i = 0; i < args.length; i++) {
      int curVal = Integer.parseInt(args[i]);
      if (curVal < minVal) {
        minVal = curVal;
      }
      if (curVal > maxVal) {
        maxVal = curVal;
      } 
    }
    System.out.println("Max: " + maxVal);
    System.out.println("Min: " + minVal);
  }
}