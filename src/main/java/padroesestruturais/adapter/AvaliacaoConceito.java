package padroesestruturais.adapter;

public class AvaliacaoConceito implements IAvaliacao {

    private String conceito;

    @Override
    public String getAvaliacao() {
        return this.conceito;
    }

    @Override
    public void setAvaliacao(String conceito) {
        this.conceito = conceito;
    }
}
