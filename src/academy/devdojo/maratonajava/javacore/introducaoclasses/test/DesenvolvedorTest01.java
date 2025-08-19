package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Desenvolvedor;

public class DesenvolvedorTest01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.nome = "Mota";
        desenvolvedor.idade = 20;
        desenvolvedor.sexo = 'M';

        System.out.println(desenvolvedor.nome);
        System.out.println(desenvolvedor.idade);
        System.out.println(desenvolvedor.sexo);
        System.out.println(desenvolvedor);
    }
}
