import java.io.IOException;

public class Exemplo {
    void umMetodo(int num) throws IOException, ArithmeticException{
        if (num == 1){
            throw new IOException("IOException");
        }else{
            throw new ArithmeticException("ArithmeticException");
        }
    }
}
