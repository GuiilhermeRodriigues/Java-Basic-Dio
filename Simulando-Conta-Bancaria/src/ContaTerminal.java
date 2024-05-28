import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome !");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agencia !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo !");
        float saldo = scanner.nextFloat();
        

        System.out.println("Olá" + nome +  ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo +  " já está disponível para saque.");

        scanner.close();

    }
}
