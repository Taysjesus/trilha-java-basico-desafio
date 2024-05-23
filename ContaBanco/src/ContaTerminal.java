import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

        public static void main(String[] args) {
           
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
            System.out.println("Por favor, digite o número da Agência!");
            String agencia = scanner.next();
            
            System.out.println("Digite o numero da sua conta");
            int numero = scanner.nextInt();
            
            System.out.println("Por favor, digite seu nome!");
            String cliente = scanner.next();
            
            System.out.println("Seu saldo é");
            double saldo = scanner.nextDouble();
           
            System.out.println("Olá" + " " + cliente + "," + "obrigada por criar uma conta em nosso banco, sua agência é " 
            + agencia  +  " " + "conta" + " "  + numero + " " + "e seu saldo" + " " + saldo + " " +"já está disponível para saque");
        
        }
    }
    
    


     
    



    

