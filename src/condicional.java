public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean inclusoNoPLano = false;
        double NotaDoFilme = 8.1;

        String tipoPlano = "Plus";


        if(anoDeLancamento >= 2022){
            System.out.println("as pessoas estão curtindo");
        }else{
            System.out.println("filme reto qu eé muito massa");
        }

        if(inclusoNoPLano || tipoPlano.equals("plusd")){
            System.out.println("deixa o cara ver essa poha logo véi");
        }else{
            System.out.println("Deu merda");
        }
    }
}
