import java.util.Scanner;
public class ContaTerminal {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    double saldo = 1000.00;



    System.out.println("Por favor digite o número da agência!   ");
    String agencia = scanner.nextLine();
    System.out.println("Por favor digite o número da conta!   ");
    int numero = scanner.nextInt();
   
    System.out.println("Por favor digite o nome do cliente!   ");

    String nome = scanner.nextLine();

    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e o número da sua conta é " + numero + ", seu saldo " + saldo + " já está disponível para saque.");
    
}
}