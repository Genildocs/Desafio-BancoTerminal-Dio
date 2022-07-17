
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco Dio! vamos começar o cadastro de sua conta.");

        System.out.println("Por favor, digite o numero da conta! ");
        int conta = scanner.nextInt();

        System.out.println("Valor depositado: ");
        double saldo =  scanner.nextDouble();

        System.out.println("Por favor, digite o numero da agência! ");
        String agencia = scanner.next();

        System.out.println("Nome do cliente: ");
        String nome = scanner.next();


        System.out.println("\nOlá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " +
                "" + conta + " e seu saldo de: " +saldo + " já está disponivel para saque.");



    }
}
