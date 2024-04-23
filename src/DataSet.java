import java.util.Scanner;
public class DataSet {
    private double sum;
    private double smallest;
    private double largest;
    private int count;
    public DataSet() {
        sum = 0;
        smallest = Double.MAX_VALUE;
        largest = Double.MIN_VALUE;
        count = 0;
    }
    public void add(double value) {
        sum += value;
        if (value < smallest) {
            smallest = value;
        }
        if (value > largest) {
            largest = value;
        }
        count++;
    }
    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
    public double getSmallest() {
        if (count == 0) {
            return 0;
        }
        return smallest;
    }
    public double getLargest() {
        if (count == 0) {
            return 0;
        }
        return largest;
    }
    public double getRange() {
        if (count == 0) {
            return 0;
        }
        return largest - smallest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataSet dataSet = new DataSet();
        System.out.print("Enter floating-point values separated by space: ");
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        for (String value : values) {
            dataSet.add(Double.parseDouble(value));
        }
        System.out.println("Average: " + dataSet.getAverage());
        System.out.println("Smallest: " + dataSet.getSmallest());
        System.out.println("Largest: " + dataSet.getLargest());
        System.out.println("Range: " + dataSet.getRange());

        scanner.close();
    }
}