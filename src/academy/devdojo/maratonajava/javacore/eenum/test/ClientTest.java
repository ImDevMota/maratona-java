package academy.devdojo.maratonajava.javacore.eenum.test;

import academy.devdojo.maratonajava.javacore.eenum.domain.Client;
import academy.devdojo.maratonajava.javacore.eenum.domain.TipoClient;
import academy.devdojo.maratonajava.javacore.eenum.domain.TipoPagamento;

public class ClientTest {
    public static void main(String[] args) {
        Client client1 = new Client("Rudo", TipoClient.PESSOA_FISICA, TipoPagamento.CREDITO);
        Client client2 = new Client("Rim", TipoClient.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
   