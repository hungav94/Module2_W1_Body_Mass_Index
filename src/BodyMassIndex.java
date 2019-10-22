import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight, height, bmi;
        System.out.print("Enter weight: ");
        weight = scanner.nextDouble();
        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if (bmi < 18) {
            System.out.println("Underweight: " + bmi);
        } else if (bmi < 25) {
            System.out.println("Normal: " + bmi);
        } else if (bmi < 30) {
            System.out.println("Overweight: " + bmi);
        } else {
            System.out.println("Obese: " + bmi);
        }
    }
}
