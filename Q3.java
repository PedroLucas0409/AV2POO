package questões;
import java.util.Scanner;

public class Q3 {

public static void main(String[] args) {

// Cria um Scanner para ler entradas do usuário
             
Scanner scanner = new Scanner(System.in);

// Lê a quantidade de números a serem somados
        System.out.print("Digite a quantidade de números a serem somados: ");
        
       
int n = scanner.nextInt();

int soma = 0;

// Lê n números e realiza a soma
        
       
for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            
           
int valor = scanner.nextInt();
            soma += valor;
        }

           
// Exibe o resultado da soma
        System.out.println("A soma dos " + n + " números é: " + soma);

// Fecha o scanner
        scanner.close();
    }
}
