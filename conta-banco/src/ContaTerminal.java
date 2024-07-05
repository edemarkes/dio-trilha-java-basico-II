import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o seu número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 
      
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
       
        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, informe o Saldo da conta: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + ".");
        System.out.println("Seu saldo é de R$" + saldo + ", já está disponível para saque.");
      
            
        scanner.close();
       
    }
}
