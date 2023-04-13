package questões;

import java.util.Scanner;

public class Q1 {
   
  
public static void main(String[] args) {
      
     
Scanner entrada = new Scanner(System.in);
      
      System.out.print("Digite o primeiro inteiro: ");
      
     
int num1 = entrada.nextInt();
      
      System.out.print("Digite o segundo inteiro: ");
      
int num2 = entrada.nextInt();
 
int soma = num1 + num2;
      
      System.out.println("A soma dos dois inteiros é: " + soma);
      
      entrada.close();
   }
}
