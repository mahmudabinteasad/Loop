import java.util.Scanner;
public class HighestTemperatureMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperatures = new double[12];
        System.out.println("Enter temperature values for each month:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter temperature for month " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }
        int highestMonth = 0;
        double highestTemperature = temperatures[0];
        for (int i = 1; i < 12; i++) {
            if (temperatures[i] > highestTemperature) {
                highestTemperature = temperatures[i];
                highestMonth = i;
            }
        }
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        System.out.println("Month with the highest temperature: " + months[highestMonth]);
        scanner.close();
    }
}
