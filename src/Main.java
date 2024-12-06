import java.util.InputMismatchException;
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

            int operationType = scanner.nextInt();
            double answer;

            //perform the operation based on users preference
            Operation operation = OperationFactory.getOperation(operationType);
            calculator.setOperation(operation);

            answer = calculator.calculate(number1, number2);
            System.out.println("The answer is: " + answer);
        }
        //error handling
        catch(ArithmeticException | IllegalArgumentException e){
            System.out.println("Error : "+ e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type. Please enter numeric values.");
            scanner.nextLine();
        }
        catch(Exception e){
            System.out.println("Error : Unexpected Error ");
        }



    }
}