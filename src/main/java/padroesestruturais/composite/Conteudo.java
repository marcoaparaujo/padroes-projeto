package padroesestruturais.composite;

public abstract class Conteudo {

    private String descricao;

    public Conteudo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getConteudo();
}
