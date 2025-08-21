package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Impressora;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Impressora impressora = new Impressora();

        estudante01.nome = "Rintaro";
        estudante01.idade = 17;
        estudante01.sexo = 'M';

        estudante02.nome = "Waguri";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        estudante01.imprime();
        estudante02.imprime();
    }
}
