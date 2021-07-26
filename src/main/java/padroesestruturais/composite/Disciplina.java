package padroesestruturais.composite;

public class Disciplina {

    private Conteudo ementa;

    public void setEmenta(Conteudo ementa) {
        this.ementa = ementa;
    }

    public String getEmenta() {
        if (this.ementa == null) {
            throw new NullPointerException("Disciplina sem ementa");
        }
        return this.ementa.getConteudo();
    }
}
