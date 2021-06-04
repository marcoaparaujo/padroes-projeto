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
        return "Matrícula não realizada";
    }

    public String formar(Aluno aluno) {
        return "Formatura não realizada";
    }

    public String trancar(Aluno aluno) {
        return "Trancamento não realizado";
    }

    public String jubilar(Aluno aluno) {
        return "Jubilamento não realizado";
    }

    public String evadir(Aluno aluno) {
        return "Evasão não realizada";
    }

}
