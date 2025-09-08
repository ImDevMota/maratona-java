package academy.devdojo.maratonajava.javacore.eenum.domain;

public class Client {
    private String nome;
    private TipoClient tipoClient;
    private TipoPagamento tipoPagamento;

    public Client(String nome, TipoClient tipoClient, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoClient = tipoClient;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nome='" + nome + '\'' +
                ", tipoClient=" + tipoClient +
                ", tipoClientInt=" + tipoClient.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
