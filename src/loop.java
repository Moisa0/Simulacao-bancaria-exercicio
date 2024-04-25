import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        
        
        Scanner lendoInput = new Scanner(System.in);
        int nnota=1;
        double somatorio = 0;
        double soma = 0;
        for (int i = 0; i < 5; i++) {


            System.out.println("Digite a nota "+ nnota);
            somatorio = lendoInput.nextDouble();
            nnota += 1;
            soma += somatorio;
        }
        double media = soma/(nnota-1);
        System.out.println(soma);
        System.out.println(nnota-1);
        System.out.println("A média das notas é "+media);
    }
}
