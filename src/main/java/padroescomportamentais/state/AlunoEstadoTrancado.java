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
        return "Formatura não realizada";
    }

    public String trancar(Aluno aluno) {
        return "Trancamento não realizado";
    }

    public String jubilar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        return "Jubilamento realizado";
    }

    public String evadir(Aluno aluno) {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        return "Evasão realizada";
    }

    public String transferir(Aluno aluno) {
        return "Transferência não realizada";
    }

}
