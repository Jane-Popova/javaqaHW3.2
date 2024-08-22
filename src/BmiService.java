public class BmiService {
    public int calculate(double heightMeter, double weightKg) {

        double bmiIndex = weightKg / Math.pow(heightMeter, 2);

        return (int) bmiIndex;
    }
}
