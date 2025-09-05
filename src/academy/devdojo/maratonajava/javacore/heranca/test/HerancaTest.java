package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;

public class HerancaTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Endereco endereco = new Endereco();

        endereco.setRua("Rua Cerejeiras");
        endereco.setCep("123412341234");

        funcionario.setNome("MotaDev");
        funcionario.setCpf("000.000.000-00");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
