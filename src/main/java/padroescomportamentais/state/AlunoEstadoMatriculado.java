package padroescomportamentais.state;

public class AlunoEstadoMatriculado implements AlunoEstado {

    private AlunoEstadoMatriculado() {};
    private static AlunoEstadoMatriculado instance = new AlunoEstadoMatriculado();
    public static AlunoEstadoMatriculado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Matriculado";
    }
    
    public String matricular(Aluno aluno) {
        return "Matrícula não realizada";
    }
    
    public String formar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        return "Formatura realizada";
    }
    
    public String trancar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        return "Trancamento realizado";
    }
    
    public String jubilar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        return "Jubilamento realizado";
    }
    
    public String evadir(Aluno aluno) {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        return "Evasão realizada";
    }

}
