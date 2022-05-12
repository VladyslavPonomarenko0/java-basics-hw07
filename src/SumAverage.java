/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    int sum = 0;
    //Lower bound is always less than or equals to upper bound
    if (lowerBound <= upperBound) {
      for (int i = lowerBound; i <= upperBound; i++) {
        sum += i;
      }
    } else {
      System.out.println("enter a valid lowerBound");
    }
    return sum;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    int sumArray = 0;
    for (int h : numbers) {
      sumArray += h;
    }
    return sumArray;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    // for example [-3,-1] - there are 3 elements, but now we should divide our sum by the lower bound
    if (upperBound < 0) {
      return -(double) sum(lowerBound, upperBound) / lowerBound;
    }
    // when the lower bound = 0, but we should count it as an element for proper division
    if (lowerBound == 0 && upperBound != 0) {
      return (double) sum(lowerBound, upperBound) / (upperBound + 1);
    }
    // to avoid NaN situations
    if (upperBound == 0 && lowerBound == 0) {
      return 0.0d;
    }
    return (double) sum(lowerBound, upperBound) / upperBound;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    int sumArray = 0;
    for (int h : numbers) {
      sumArray += h;
    }
    // to avoid NaN situations
    if (sumArray == 0.0) {
      return 0.0d;
    }
    return (double) sumArray / numbers.length;
  }
}