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
        return "Matrícula não pode ser realizada pois o aluno está jubilado";
    }
    
   public String formar(Aluno aluno) {
        return "Formatura não pode ser realizada pois o aluno está jubilado";
    }
   
   public String trancar(Aluno aluno) {
         return "Trancamento não pode ser realizado pois o aluno está jubilado";
   }
     
   public String jubilar(Aluno aluno) {
         return "Jubilamento não pode ser realizado pois o aluno está jubilado";
   }
   
   public String evadir(Aluno aluno) {
         return "Evasão não pode ser realizada pois o aluno está jubilado";       
   }
}
