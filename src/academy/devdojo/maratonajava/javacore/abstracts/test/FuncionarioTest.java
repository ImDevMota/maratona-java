package academy.devdojo.maratonajava.javacore.abstracts.test;

import academy.devdojo.maratonajava.javacore.abstracts.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.abstracts.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Rukia", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Kurosaki", 10000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
