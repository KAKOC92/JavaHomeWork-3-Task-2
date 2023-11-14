public class BmiService {
    public double bmi( double weightInKg, double heightInM){
        double bmi = weightInKg / (heightInM * heightInM);
    return (int) bmi;
    }
}
