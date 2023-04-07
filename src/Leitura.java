import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine(); //String

        System.out.println("Qual o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt(); //Inteiro

        System.out.println("Diga sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble(); //Decimal

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
