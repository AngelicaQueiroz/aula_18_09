//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double divide(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Não pode ser dividido por zero");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        double resultado;
        try {
            resultado = divide(10, 0);
            System.out.printf("resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.printf("Exceção capturada: " + e.getMessage());
        }
    }
}


