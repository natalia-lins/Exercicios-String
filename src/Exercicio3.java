import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome completo:");  // Pede o nome completo
        String nomeCompleto = ler.nextLine();  // Lê a linha inteira

        // Conectores que devem ser ignorados
        String[] conectores = {"e", "do", "da", "dos", "das", "de", "di", "du"};
        String[] nomeDividido = nomeCompleto.split(" ");  // Divide o nome em palavras

        String iniciais = "";  // Inicializa a string de iniciais

        for (String palavra : nomeDividido) {  // Para cada palavra do nome
            boolean ehConector = false;
            for (String c : conectores) {  // Para cada conector
                if (palavra.equalsIgnoreCase(c)) { //ignora maiúsculo e minúsculo
                    ehConector = true; // Se a palavra for igual a algum conector, for de conector é quebrado
                    break;
                }
            }
            if (!ehConector && palavra.length() > 0) {  // Se não for conector e seus caracteres maior do que 0
                iniciais += Character.toUpperCase(palavra.charAt(0));  // Adiciona inicial em maiúsculo
            }
        }

        System.out.println("Iniciais: " + iniciais);  // Exibe as iniciais
    }
}
