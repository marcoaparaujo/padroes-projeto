package padroesestruturais.decorator;

public class AtividadesComplementares extends CursoDecorator {

    public AtividadesComplementares(Curso curso) {
        super(curso);
    }

    public float getPercentualCargaHoraria() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "ACC";
    }
}
