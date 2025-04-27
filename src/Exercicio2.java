import java.util.Scanner;

public class Exercicio2 {

    //Método para converter números digitados em texto
    public static String converterEmTexto(char num) {
        switch (num) {
            case '0': return "zero";
            case '1': return "um";
            case '2': return "dois";
            case '3': return "três";
            case '4': return "quatro";
            case '5': return "cinco";
            case '6': return "seis";
            case '7': return "sete";
            case '8': return "oito";
            case '9': return "nove";
            default: return "";
        }
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner (System.in);

        // Digitar número inteiro
        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        // Transforma número (int) em String
        String numTexto = Integer.toString(num);

        // Imprimir número por extenso
        System.out.print("Dígitos por extenso: ");
        // Para cada caracter (número) digitado
        for (char c : numTexto.toCharArray()) {
            System.out.print(converterEmTexto(c) + " "); // Imprime o resultado do método converterEmTexto para cada caracter
        }
    }

}
