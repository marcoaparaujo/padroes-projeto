package padroescomportamentais.state;

public class AlunoEstadoMatriculado extends AlunoEstado {

    private AlunoEstadoMatriculado() {};
    private static AlunoEstadoMatriculado instance = new AlunoEstadoMatriculado();
    public static AlunoEstadoMatriculado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Matriculado";
    }
    
    public boolean formar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        return true;
    }
    
    public boolean trancar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        return true;
    }
    
    public boolean jubilar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        return true;
    }
    
    public boolean evadir(Aluno aluno) {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        return true;
    }

    public boolean transferir(Aluno aluno) {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        return true;
    }

}
