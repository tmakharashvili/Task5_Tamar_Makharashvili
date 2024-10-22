public class Task5 {
    public static void main(String[] args) {
        double celsius = convertToCelsius(98.6);
        System.out.println(celsius);
    }
    public static double convertToCelsius(double fahrenheit){
        return 95*(fahrenheit-32);
    }
}
