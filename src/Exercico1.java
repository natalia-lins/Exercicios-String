import java.util.Scanner;

public class Exercico1 {

    // Método para contar vogais em uma palavra
    static int contaVogais(String palavra){
        int vogais = 0;
        // Para cada caracter de uma palavra (transformada em minúscula para facilitar comparação)
        for (char c : palavra.toLowerCase().toCharArray()){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++; // Se for vogal, incrementa na variável vogais
            }
        }
        return vogais;
    }

    // Método para contar dígitos em uma palavra
    static int contaDigitos (String palavra){
        int digitos=0;
        // Para cada caracter da palavra
        for (char c : palavra.toCharArray()){
            if (c >= '0' && c<= '9') {
                digitos++; // Se o caracter for igual a 0 até 9, incrementa na variável dígitos
            }
        }
        return digitos;
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = ler.nextLine(); // Lê palavra

        System.out.println("Número de caracteres: "+ palavra.length()); // .lenght é uma propriedade que retorna o tamanho da String
        System.out.println("Palavra em maiúsculo: " + palavra.toUpperCase()); // .toUpperCase é uma propriedade que retona a String em maiúsculo
        System.out.println("Quantidade de vogais: " + contaVogais(palavra)); // chama método contaVogais com a palavra digitada
        System.out.println("Quantidade de digitos (0 a 9): " + contaDigitos(palavra)); // chama método contaDigitos com a palavra digitada
    }
}