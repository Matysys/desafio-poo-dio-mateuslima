package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Endereco endereco;
    private String patrocinio;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Integer> idadeDevs = new HashSet<>();
    private Double mediaIdadeDevs;

    public Set<Integer> getIdadeDevs() {
        return idadeDevs;
    }

    public void setIdadeDevs(Integer idadeDevs) {
        this.idadeDevs.add(idadeDevs);
    }



    public Double getMediaIdadeDevs() {
        return mediaIdadeDevs;
    }

    public void setMediaIdadeDevs() {
        double soma = 0.0;
        for(double valor: idadeDevs){
            soma += valor;
        }

        double media = soma/idadeDevs.size();

        this.mediaIdadeDevs = media;
    }

    private Set<Conteudo> conteudos = new LinkedHashSet<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

    public void setPatrocinio(String patrocinio) {
        this.patrocinio = patrocinio;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getPatrocinio() {
        return patrocinio;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
