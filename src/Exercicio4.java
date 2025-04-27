import java.util.Scanner;

public class Exercicio4 {

    // Função que conta o número de palavras
    public static int contarPalavras(String texto) {
        String[] palavras = texto.trim().split("\\s+");  // Divide texto em palavras por espaços em branco
        return palavras.length;  // Retorna o número de palavras (.length retorna tamanho do array)
    }

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);  // Cria Scanner

        System.out.println("Digite um texto:");  // Pede texto ao usuário
        String texto = ler.nextLine();  // Lê o texto

        //Chama função e imprime resultado
        System.out.println("Número de caracteres: " + texto.length());
        System.out.println("Número de palavras: " + contarPalavras(texto));
    }
}
