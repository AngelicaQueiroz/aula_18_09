public class exemplo_try_aninhado {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Try bloco 01");
                int num = 15 / 0;
                System.out.println(num);
            } catch (ArithmeticException ae) {
                System.out.println("Try bloco 01" + ae);
            }
            try {
                System.out.println("Try bloco 02");
                int num = 100 / 0;
                System.out.println(num);
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("Bloco de exceção 02:" + aiobe);
            }
            System.out.println("Declaração geral após os blocos 01 e 02.");
        } catch (ArithmeticException ae2) {
            System.out.println("Bloco principal do Arithimetic Exception: " + ae2);
        } catch (ArrayIndexOutOfBoundsException aiobe2) {
            System.out.println("Bloco principal Array Index Out Of Bounds Exception: " + aiobe2);
        } catch (Exception e) {
            System.out.println("Bloco principal Exceção Geral: " + e);
        }
    }
}