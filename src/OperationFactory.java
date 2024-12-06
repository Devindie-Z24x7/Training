public class OperationFactory {
    public static Operation getOperation(int operation){
        return switch (operation) {
            case '+'-> new Add();
            case '-' -> new Subtract();
            case '*' -> new Multiply();
            case '/' -> new Divide();
            default -> throw new IllegalStateException("Undefined operation");
        };

    }
}
