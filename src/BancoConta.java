import java.util.Scanner;

public class BancoConta {
    public static void main(String[] args) throws Exception {
     
       try  (Scanner scanner = new Scanner(System.in)) 
        {
                String nomecliente = ("Samuel") ;
            System.out.println("Digite o número: ");
               int numero = scanner.nextInt();

           System.out.println("Digite o número da agencia: ");
               int agencia = scanner.nextInt();
            
            System.out.println("Digite o nome: " + nomecliente);
           
            System.out.println("Digite o saldo: ");
                double saldo = Double.parseDouble(scanner.nextLine());


                System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo " + saldo + " já está disponível para saque.");

        }
    
    }

}
