package padroescomportamentais.state;

public class AlunoEstadoEvadido implements AlunoEstado {

    private AlunoEstadoEvadido() {};
    private static AlunoEstadoEvadido instance = new AlunoEstadoEvadido();
    public static AlunoEstadoEvadido getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Evadido";
    }
    
    public String matricular(Aluno aluno) {
        return "Matrícula não realizada";
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
         return "Evasão não realizada";
   }

    public String transferir(Aluno aluno) {
        return "Transferência não realizada";
    }
}

