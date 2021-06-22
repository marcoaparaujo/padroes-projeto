package padroescomportamentais.state;

public class Aluno {
    
    private String nome;
    private AlunoEstado estado;    

    public Aluno() {
        this.estado = AlunoEstadoMatriculado.getInstance();
    }
    
    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }
    
    public String matricular() {
        return estado.matricular(this);
    }
    
    public String formar() {
        return estado.formar(this);
    }
    
    public String trancar() {
        return estado.trancar(this);
    }
    
    public String jubilar() {
        return estado.jubilar(this);
    }
    
    public String evadir() {
        return estado.evadir(this);
    }

    public String transferir() {
        return estado.transferir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AlunoEstado getEstado() {
        return estado;
    }    
}
