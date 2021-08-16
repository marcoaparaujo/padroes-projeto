package padroesestruturais.decorator;

public class TrabalhoConclusaoCurso extends CursoDecorator {

    public TrabalhoConclusaoCurso(Curso curso) {
        super(curso);
    }

    public float getPercentualCargaHoraria() {
        return 5.0f;
    }

    public String getNomeEstrutura() {
        return "TCC";
    }
}
