import java.io.IOException;

public class ExemploUsandoThrows {
    public static void main(String[] args) {
        try {
            Exemplo obj = new Exemplo();
            obj.umMetodo(1);
        } catch (IOException | ArithmeticException ex) {
            System.out.println(ex);
        }
    }
}
