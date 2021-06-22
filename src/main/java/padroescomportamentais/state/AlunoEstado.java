package padroescomportamentais.state;

public interface AlunoEstado {
    
    String getEstado();
    
    String matricular(Aluno aluno);
    
    String formar(Aluno aluno);
    
    String trancar(Aluno aluno);
    
    String jubilar(Aluno aluno);
    
    String evadir(Aluno aluno);

    String transferir(Aluno aluno);
    
}
