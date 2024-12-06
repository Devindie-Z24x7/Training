public class OperationFactory {
    public static Operation getOperation(int operation){
        return switch (operation) {
            case 1 -> new Add();
            case 2 -> new Subtract();
            case 3 -> new Multiply();
            case 4 -> new Divide();
            default -> throw new IllegalStateException("Undefined operation: " + operation);
        };

    }
}
