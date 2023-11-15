public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 98;
        double heightInM = 1.87;
        double bmi = service.bmi(98, 1.87);
        System.out.println(bmi);
    }
}