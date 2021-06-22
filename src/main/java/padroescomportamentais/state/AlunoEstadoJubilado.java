package padroescomportamentais.state;

public class AlunoEstadoJubilado implements AlunoEstado {

    private AlunoEstadoJubilado() {};
    private static AlunoEstadoJubilado instance = new AlunoEstadoJubilado();
    public static AlunoEstadoJubilado getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Jubilado";
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
         return "Jubilamento não realizado";
   }
   
   public String evadir(Aluno aluno) {
         return "Evasão não realizada";
   }

    public String transferir(Aluno aluno) {
        return "Transferência não realizada";
    }

}
