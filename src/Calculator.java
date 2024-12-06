public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double num1, double num2){
        if(operation == null){
            throw new IllegalArgumentException("Empty Operation. Please enter an operation");
        }
        return operation.operate(num1, num2);

    }
}
