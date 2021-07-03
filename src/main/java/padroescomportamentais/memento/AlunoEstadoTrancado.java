package padroescomportamentais.memento;

import padroescomportamentais.state.Aluno;

public class AlunoEstadoTrancado implements AlunoEstado {

    private AlunoEstadoTrancado() {};
    private static AlunoEstadoTrancado instance = new AlunoEstadoTrancado();
    public static AlunoEstadoTrancado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Trancado";
    }

}
