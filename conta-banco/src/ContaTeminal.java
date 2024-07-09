import java.util.Scanner;

public class ContaTeminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta:");
        int numeroDaConta = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o número da Agência:");
        String numeroDaAgencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeDoCliente = scanner.nextLine();

        System.out.println("Digite o numero da conta:");
        float saldo = Float.parseFloat(scanner.nextLine());

        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2123f já está disponível para saque", nomeDoCliente, numeroDaAgencia, numeroDaConta, saldo);
    }
}
