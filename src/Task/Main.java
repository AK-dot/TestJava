package Task;

public class Main {
    public static void main(String[] args) throws WrongInputException {
        DataInput input = new DataInput();
        DataInputCheck check = new DataInputCheck();
        NumberConverter numberConverter = new NumberConverter();
        Calculation calculation = new Calculation();
        Calculator calculator = new Calculator(input, check, numberConverter, calculation);
        calculator.start();
    }
}