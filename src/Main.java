public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeter = 1.87;
        double weightKg = 98;

        int bmi = service.calculate(heightMeter, weightKg); // должно получиться 28
        System.out.println(bmi);
    }
}