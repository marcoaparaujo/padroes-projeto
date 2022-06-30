package padroescomportamentais.state;

public class AlunoEstadoEvadido extends AlunoEstado {

    private AlunoEstadoEvadido() {};
    private static AlunoEstadoEvadido instance = new AlunoEstadoEvadido();
    public static AlunoEstadoEvadido getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Evadido";
    }
     
   public boolean jubilar(Aluno aluno) {
         aluno.setEstado(AlunoEstadoJubilado.getInstance());
         return true;
   }
}

