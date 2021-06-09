package Task;

import java.math.BigDecimal;

class Calculation {
    public BigDecimal calculation(int number1, int number2, char operand) {
        BigDecimal a = new BigDecimal(number1);
        BigDecimal b = new BigDecimal(number2);
        BigDecimal result = null;
        switch (operand) {
            case '+':
                result = a.add(b);
                break;
            case '-':
                result = a.subtract(b);
                break;
            case '*':
                result = a.multiply(b);
                break;
            case '/':
                result = a.divide(b, 9, BigDecimal.ROUND_CEILING);
                break;
        }
        return result;
    }
}