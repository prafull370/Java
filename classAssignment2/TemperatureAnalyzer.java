public class TemperatureAnalyzer {
  public static void main(String[] args) {
      // Assuming temperatures are stored in a 2D array
      double[][] temperatures = {
              {25.5, 28.0, 29.5, 27.3, 26.8},  // Metropolitan 1
              {27.8, 29.3, 30.1, 28.5, 27.7},  // Metropolitan 2
              {26.0, 28.2, 29.0, 27.8, 25.9},  // Metropolitan 3
              {28.3, 30.5, 31.2, 29.7, 28.9}   // Metropolitan 4
      };

      calculateCityWiseStats(temperatures);
      calculateOverallStats(temperatures);
  }

  public static void calculateCityWiseStats(double[][] temperatures) {
      System.out.println("City-wise Statistics:");
      for (int city = 0; city < temperatures.length; city++) {
          double sum = 0;
          double max = Double.MIN_VALUE;
          double min = Double.MAX_VALUE;
          for (int month = 0; month < temperatures[city].length; month++) {
              double temp = temperatures[city][month];
              sum += temp;
              max = Math.max(max, temp);
              min = Math.min(min, temp);
          }
          double average = sum / temperatures[city].length;
          System.out.println("Metropolitan " + (city + 1) +
                  ": Average = " + average + ", Max = " + max + ", Min = " + min);
      }
  }

  public static void calculateOverallStats(double[][] temperatures) {
      System.out.println("\nOverall Statistics:");
      double overallSum = 0;
      double overallMax = Double.MIN_VALUE;
      double overallMin = Double.MAX_VALUE;
      int totalMonths = temperatures.length * temperatures[0].length;
      for (double[] cityTemps : temperatures) {
          for (double temp : cityTemps) {
              overallSum += temp;
              overallMax = Math.max(overallMax, temp);
              overallMin = Math.min(overallMin, temp);
          }
      }
      double overallAverage = overallSum / totalMonths;
      System.out.println("Overall Average = " + overallAverage +
              ", Overall Max = " + overallMax + ", Overall Min = " + overallMin);
  }
}
