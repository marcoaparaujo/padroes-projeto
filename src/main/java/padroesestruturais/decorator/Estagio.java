package padroesestruturais.decorator;

public class Estagio extends CursoDecorator {

    public Estagio(Curso curso) {
        super(curso);
    }

    public float getPercentualCargaHoraria() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Estágio";
    }
}
