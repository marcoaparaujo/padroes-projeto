package padroescomportamentais.state;

public abstract class AlunoEstado {
    
    public abstract String getEstado();

    public boolean matricular(Aluno aluno) {
        return false;
    }

    public boolean formar(Aluno aluno) {
        return false;
    }

    public boolean trancar(Aluno aluno) {
        return false;
    }

    public boolean jubilar(Aluno aluno) {
        return false;
    }

    public boolean evadir(Aluno aluno) {
        return false;
    }

    public boolean transferir(Aluno aluno) {
        return false;
    }
    
}
