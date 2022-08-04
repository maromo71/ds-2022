package model;

import java.util.ArrayList;
import java.util.List;

public class Proprietario {
    private long id;
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String fone;
    private List<Carro> carros = new ArrayList<>();

    //Definir o construtor (ALT INSERT)

    public Proprietario(long id, String nome, String endereco, String cidade, String estado, String fone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.fone = fone;
    }

    //Definir os gets e sets da nossa classe

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    //Definir nossos métodos
    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }

    //Definir uma sobrescrita para o toString

    @Override
    public String toString() {
        String texto = "Dados do Proprietário \n" +
                "Nome: " + nome + "\n" +
                "Fone: " + fone + "\n" +
                "Lista de seus carros \n";
        String lista = "";
        for(Carro carro : carros){
            lista += carro.getMarca() + " - " +
                    carro.getModelo() + "\n";
        }
        return  texto + lista;
    }
}
