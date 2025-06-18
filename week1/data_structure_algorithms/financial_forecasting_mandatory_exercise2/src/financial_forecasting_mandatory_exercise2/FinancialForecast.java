package financial_forecasting_mandatory_exercise2;

public class FinancialForecast {
    public static double forecastRecursive(double baseValue, double growthRate, int years) {
        if (years == 0) {
            return baseValue;
        }
        return forecastRecursive(baseValue, growthRate, years - 1) * (1 + growthRate);
    }

   
    public static double forecastMemoized(double baseValue, double growthRate, int years, double[] memo) {
        if (years == 0) return baseValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = forecastMemoized(baseValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
    public static void main(String[] args) {
        double baseValue = 10000;     
        double growthRate = 0.08;     
        int years = 5;
        double result = forecastRecursive(baseValue, growthRate, years);
        System.out.println("Future value (recursive): ₹" + result);

        double[] memo = new double[years + 1];
        double resultMemo = forecastMemoized(baseValue, growthRate, years, memo);
        System.out.println("Future value (memoized): ₹" + resultMemo);
    }
}
