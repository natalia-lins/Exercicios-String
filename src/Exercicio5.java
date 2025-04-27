import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);  // Cria Scanner

        System.out.println("Digite um texto:");  // Pede texto
        String texto = ler.nextLine();  // Lê texto

        String textoAjustado = texto.trim().replaceAll("\\s+", " ");  // Remove espaços adicionais no
        // início e no final e substitui espaços em branco com mais de 1 caracter por apenas 1

        System.out.println("Texto ajustado: " + textoAjustado);  // Mostra texto limpo

    }
}
