package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero02+numero01+"Valor"+numero02+numero01);

        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10==20;
        boolean isDezIgualDez = 10==10.0;

        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " +isDezIgualVinte);
        System.out.println("isDezIgualDez " +isDezIgualDez);

        double contaCorrente = 100;
        double contaPoupanca = 20000;
        float valorPs5 = 3500F;

        boolean isPossivelComprarPs5 = contaCorrente > valorPs5 || contaPoupanca > valorPs5;
    }
}
