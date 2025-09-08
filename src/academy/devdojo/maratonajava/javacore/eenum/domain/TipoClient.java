package academy.devdojo.maratonajava.javacore.eenum.domain;

public enum TipoClient {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int valor;
    private final String relatorio;

    TipoClient(int valor, String relatorio) {
        this.valor = valor;
        this.relatorio = relatorio;
    }

    public int getValor() {
        return valor;
    }
}
