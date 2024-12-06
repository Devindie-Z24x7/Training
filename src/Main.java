import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        try {
            //Taking user inputs
            System.out.print("Enter the first number ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter the second number ");
            double number2 = scanner.nextDouble();

            System.out.print("Select the operation you want to perform \n");
            System.out.print("Addition : 1 \n");
            System.out.print("Subtraction : 2 \n");
            System.out.print("Multiplication : 3 \n");
            System.out.print("Division : 4 \n");

            int operation = scanner.nextInt();

            //perform the operation based on users preference
            double answer = switch (operation) {
                case 1 -> calculator.addition(number1, number2);
                case 2 -> calculator.subtraction(number1, number2);
                case 3 -> calculator.multiplication(number1, number2);
                case 4 -> calculator.division(number1, number2);
                default -> throw new IllegalArgumentException("Invalid Operation");
            };

            System.out.println("The answer is: " + answer);
        }
        //error handling
        catch(ArithmeticException | IllegalArgumentException e){
            System.out.println("Error : "+ e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error : Invalid Input ");
        }



    }
}