import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
            input.nextLine();

        // Prompt the user to enter height in inches
        System.out.print("Enter height in feet and  inches(example input: 5 10): ");
        //Read in next line in feet/inches
        String[] heightInput = input.nextLine().split(" ");
        System.out.println(heightInput);
        double feet=Double.parseDouble(heightInput[0]);
        double inches =Double.parseDouble( heightInput[1]);
        System.out.println(" you are " +feet +" feet " + inches+" inches");

        double height= feet*12+inches;
        //  double height = input.nextDouble();


        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms /
                (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " +String.format("%.2f", bmi));
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
