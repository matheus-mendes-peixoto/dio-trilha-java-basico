import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Para criar sua conta no banco, por favor, preencha os seguintes campos:");

    System.out.println("------------------------------");
    
    System.out.println("Qual é o seu nome?");
    String nomeCliente = scanner.nextLine();

    System.out.println("Qual é o número da sua agência?");
    String agencia = scanner.next();

    System.out.println("Qual é o número da sua conta?");
    String conta = scanner.next();

    System.out.println("Qual é o seu saldo inicial?");
    double saldo = scanner.nextDouble();

    System.out.println("------------------------------");

    System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco. Sua agência é "
        + agencia + ", sua conta é " + conta + ", e seu saldo inicial de R$ " + saldo
        + " já está disponível para saque.");

  }
}
