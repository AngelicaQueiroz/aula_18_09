import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Diga seu nome: ");
        String nome = sc.next();

        System.out.println("Digite sua idade: ");
        String idade = sc.next();

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade);

        }

    }