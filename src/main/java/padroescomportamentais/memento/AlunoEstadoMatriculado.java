package padroescomportamentais.memento;

import padroescomportamentais.state.Aluno;

public class AlunoEstadoMatriculado implements AlunoEstado {

    private AlunoEstadoMatriculado() {};
    private static AlunoEstadoMatriculado instance = new AlunoEstadoMatriculado();
    public static AlunoEstadoMatriculado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Matriculado";
    }

}
