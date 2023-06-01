package subSistema;

import java.util.List;

public class Cliente {
    private static int cont = 1;
    private int id;
    private String nome;
    private Endereco endereco;
    private List<Produto> lista;

    public Cliente(){}
    public Cliente(String nome, Endereco endereco, List<Produto> lista) {
        this.id = this.cont++;
        this.nome = nome;
        this.endereco = endereco;
        this.lista = lista;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        for(Produto p : lista){
            this.lista.add(p);
        }
    }
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", lista=" + lista + "]";
    }

}