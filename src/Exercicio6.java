import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

    // Função de recombinação
    public static String[] recombinacao(String s1, String s2) {
        Random random = new Random();
        int pontoCorte = random.nextInt(s1.length()); // sorteia o ponto de corte de acordo com o tamanho da string

        String parte1_s1 = s1.substring(0, pontoCorte); // divide a string do começo a posição sorteada
        String parte2_s1 = s1.substring(pontoCorte); // divide a string da posição sorteada ao final

        String parte1_s2 = s2.substring(0, pontoCorte);
        String parte2_s2 = s2.substring(pontoCorte);

        // Troca as metades para criar dois filhos
        String filho1 = parte1_s1 + parte2_s2;
        String filho2 = parte1_s2 + parte2_s1;

        return new String[] { filho1, filho2 };
    }

    // Função de mutação
    public static String mutacao(String s) {
        Random random = new Random();
        char[] caracteres = {'A', 'T', 'G', 'C'}; // caracteres possíveis

        int posicaoMutacao = random.nextInt(s.length()); //sorteia posição que irá mudar
        char novoCaractere = caracteres[random.nextInt(caracteres.length)]; // armazena caracter sorteado do string caracteres

        // Garante que o novo caractere seja diferente do atual
        while (s.charAt(posicaoMutacao) == novoCaractere) {
            novoCaractere = caracteres[random.nextInt(caracteres.length)];
        }

        StringBuilder sb = new StringBuilder(s); // Classe StringBuilder, permite modificar String diretamente
        sb.setCharAt(posicaoMutacao, novoCaractere); // Coloca o novo caracter na posição sorteada

        return sb.toString(); // Retorna String com mutação (mudança de caracter)
    }


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // Classe Scanner, permite leitura
        boolean erro;
        String s1;
        String s2;

        do {
            System.out.println("Digite a primeira string (S1): ");
            s1 = ler.nextLine().toUpperCase();
            System.out.println("Digite a segunda string (S2): ");
            s2 = ler.nextLine().toUpperCase();

            if (s1.length() != s2.length()) {
                erro = true;
                System.out.println("Erro! As strings devem ter o mesmo tamanho.");
            } else {
                erro = false;
            }
        } while (erro == true); // Código se repete até que s1 e s2 tenham o mesmo tamanho

        // Recombinação
        String[] filhos = recombinacao(s1, s2); // Vetor recebe resultado do método
        String filho1 = filhos[0]; // Variável recebe a posição 0 do vetor filhos
        String filho2 = filhos[1]; // Variável recebe a posição 1 do vetor filhos


        System.out.println("Exercício 1 - População Final:");
        System.out.println("S1 (pai 1): " + s1);
        System.out.println("S2 (pai 2): " + s2);
        System.out.println("S3 (filho 1): " + filho1);
        System.out.println("S4 (filho 2): " + filho2);
        System.out.println("---------------------------------");
        System.out.println("Exercício 2 - Mutação S1:");
        System.out.println("S1 mutado: " + mutacao(s1));
        System.out.println("---------------------------------");
        System.out.println("Exercício 3 - População final com um dos filhos mutados:");
        System.out.println("S1 (pai 1): " + s1);
        System.out.println("S2 (pai 2): " + s2);
        System.out.println("S3 (filho 1 mutado): " + mutacao(filho1));
        System.out.println("S4 (filho 2): " + filho2);

    }
}
