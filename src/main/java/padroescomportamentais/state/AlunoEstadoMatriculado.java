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
        return "Matrícula não pode ser efetuada uma vez que o aluno está matriculado";
    }
    
    public String formar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        return "Formatura pode ser realizada";
    }
    
    public String trancar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        return "Trancamento pode ser realizado";        
    }
    
    public String jubilar(Aluno aluno) {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        return "Jubilamento pode ser realizado";           
    }
    
    public String evadir(Aluno aluno) {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        return "Evasão pode ser realizada";        
    }
}
