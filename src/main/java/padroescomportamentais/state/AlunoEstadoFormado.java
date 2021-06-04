package padroescomportamentais.state;

public class AlunoEstadoFormado implements AlunoEstado {

    private AlunoEstadoFormado() {};
    private static AlunoEstadoFormado instance = new AlunoEstadoFormado();
    public static AlunoEstadoFormado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Formado";
    }

    public String matricular(Aluno aluno) {
        return "Matrícula não pode ser realizada pois o aluno está formado";
    }

    public String formar(Aluno aluno) {
        return "Formatura não pode ser realizada pois o aluno está formado";
    }

    public String trancar(Aluno aluno) {
        return "Trancamento não pode ser realizado pois o aluno está formado";
    }

    public String jubilar(Aluno aluno) {
        return "Jubilamento não pode ser realizado pois o aluno está formado";
    }

    public String evadir(Aluno aluno) {
        return "Evasão não pode ser realizada pois o aluno está formado";
    }

}
