import Exceptions.CalculatorException;

public class Calculator {
    public int dividir(int dividendo, int divisor) throws CalculatorException{
        if (divisor == 0) throw new CalculatorException("NO se puede dividir por CERO / DIV EXCEPTION");
        return dividendo/divisor;
    }
}
