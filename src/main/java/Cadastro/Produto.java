package Cadastro;

public class Produto {

    private String nome;
    private int unidade;

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", unidade=" + unidade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }


}
