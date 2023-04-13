package questões;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q7 {

    public static void main(String[] args) {

        // Define o nome do arquivo
        String nomeArquivo = "numeros.txt";

        // Tenta abrir o arquivo e somar os números
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            int soma = 0;
            while ((linha = br.readLine()) != null) {
                int numero = Integer.parseInt(linha);
                soma += numero;
            }
            System.out.println("A soma dos números no arquivo é " + soma);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo " + nomeArquivo);
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("O arquivo " + nomeArquivo + " não contém apenas números inteiros");
            e.printStackTrace();
        }
    }
}
