package padroescomportamentais.state;

public class AlunoEstadoTrancado implements AlunoEstado {

    private AlunoEstadoTrancado() {};
    private static AlunoEstadoTrancado instance = new AlunoEstadoTrancado();
    public static AlunoEstadoTrancado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Trancado";
    }

    public String matricular(Aluno aluno) {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        return "Matrícula realizada";
    }

    public String formar(Aluno aluno) {
        return "Formatura não pode ser realizada pois o aluno está trancado";
    }

    public String trancar(Aluno aluno) {
        return "Trancamento não pode ser realizado pois o aluno está trancado";
    }

    public String jubilar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        return "Jubilamento ealizado";
    }

    public String evadir(Aluno aluno) {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        return "Evasão realizada";
    }

}
