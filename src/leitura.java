import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de lançamento do filme:");
        int ano = leitura.nextInt();

        System.out.println("Qual a avaliação do filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(avaliacao);


    }

}
