package br.com.dio.desafio.dominio;

public class Endereco {

    public Endereco(String rua, String cep, String referencia, String cidade, String uf) {
        this.rua = rua;
        this.cep = cep;
        this.referencia = referencia;
        this.cidade = cidade;
        this.uf = uf;
    }

    private String rua;
    private String cep;
    private String referencia;
    private String cidade;
    private String uf;

    public String getRua() {
        return rua;
    }

    public String getCep() {
        return cep;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }
}
