import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner lendoSeguinte = new Scanner(System.in);

        String nome = "Moisa";
        String tipoDeConta = "corrente";
        double saldoConta = 2500;

        int opcaoEscolhida = 0;

        System.out.println("****************************************\n\nDados iniciais do Cliente:\n\nNome:                  "+nome+"\nTipo de conta:         "+tipoDeConta+"\nSaldo de conta:        R$ "+saldoConta+"\n\n****************************************");


        String inicializador = "Operações\n\n1- Consultar saldos\n2-Receber valor\n3-Transferir valor\n4-Sair\n\nDigite a opção desejada:";



    while(opcaoEscolhida!=4) {
        System.out.println(inicializador);

        opcaoEscolhida = lendoSeguinte.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                System.out.println("Você possui R$ " + saldoConta);
                break;

            case 2:
                System.out.println("Quanto você recebeu?");
                double recebido = lendoSeguinte.nextDouble();
                saldoConta += recebido;
                System.out.println("Seu saldo total atual é de R$" + saldoConta);

                break;

            case 3:
                System.out.println("Qual o valor deseja transferir?");
                double transferido = lendoSeguinte.nextDouble();

                    if(transferido>saldoConta){
                        System.out.println("Saldo insuficiente para transferência");
                    }else{
                        saldoConta-=transferido;
                        System.out.println("Seu saldo total atual é de R$" + saldoConta);
                    }
                break;


            case 4:
                System.out.println("Agradecemos por utilizar nossos serviços");
                break;

            default:
                System.out.println("A operação selecionada não é uma opcão válida");
        }

    }

    }
}

