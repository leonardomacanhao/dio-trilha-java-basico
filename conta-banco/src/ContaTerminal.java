import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta!");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o valor do seu saldo!");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível");
    }
}
 