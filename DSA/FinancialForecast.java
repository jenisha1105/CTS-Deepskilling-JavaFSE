public class FinancialForecast {

    public static double forecast(
            double amount,
            double growthRate,
            int years) {

        if (years == 0) {
            return amount;
        }

        return forecast(
                amount * (1 + growthRate),
                growthRate,
                years - 1);
    }

    public static void main(String[] args) {

        double initialAmount = 1000;

        double growthRate = 0.10;

        int years = 3;

        double futureValue =
                forecast(
                        initialAmount,
                        growthRate,
                        years);

        System.out.println(
                "Future Value = "
                        + futureValue);
    }
}
