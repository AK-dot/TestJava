package Task;

import java.math.BigDecimal;
import java.util.regex.Matcher;

class Calculator {
    private DataInput input;
    private DataInputCheck check;
    private NumberConverter numberConverter;
    private Calculation calculation;

    Calculator(DataInput input, DataInputCheck check, NumberConverter numberConverter, Calculation calculation) {
        this.input = input;
        this.check = check;
        this.numberConverter = numberConverter;
        this.calculation = calculation;
    }

    void start() throws WrongInputException {
        String string;
        while (!(string = input.dataInput()).equals("EXIT")) {
            if (check.isArabicNumber(string)) {
                Matcher resultMatch = check.getMatcherArabicNumber(string);
                int number1 = Integer.parseInt(resultMatch.group(1));
                int number2 = Integer.parseInt(resultMatch.group(3));
                char operand = resultMatch.group(2).charAt(0);
                input.output(calculation.calculation(number1, number2, operand).toString());
            } else if (check.isRomanNumber(string)) {
                Matcher resultMatch = check.getMatcherRomanNumber(string);
                int number1 = numberConverter.romanToInt(resultMatch.group(1));
                int number2 = numberConverter.romanToInt(resultMatch.group(3));
                char operand = resultMatch.group(2).charAt(0);
                input.output(numberConverter.intToRoman(calculation.calculation(number1, number2, operand).intValue()));
            } else throw new WrongInputException("Неверно введены данные!!!");
        }
    }
}