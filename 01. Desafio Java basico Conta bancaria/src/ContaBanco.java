import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Agencia: ");
        String numeroAgencia = scanner.next();
        System.out.println("Nome: ");
        String nomeCliente = scanner.next();
        System.out.println("Saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " Numero da conta de " + numeroConta + " Seu saldo é " + saldo + " já está disponivel");
    }
}
