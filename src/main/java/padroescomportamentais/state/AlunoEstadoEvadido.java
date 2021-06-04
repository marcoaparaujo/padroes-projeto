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
        return "Matrícula não pode ser realizada pois o aluno está evadido";
    }
    
   public String formar(Aluno aluno) {
        return "Formatura não pode ser realizada pois o aluno está evadido";
    }
   
   public String trancar(Aluno aluno) {
         return "Trancamento não pode ser realizado pois o aluno está evadido";
   }
     
   public String jubilar(Aluno aluno) {
         aluno.setEstado(AlunoEstadoJubilado.getInstance());
         return "Jubilamento pode ser realizado";
   }
   
   public String evadir(Aluno aluno) {
         return "Evasão não pode ser realizada pois o aluno está evadido";       
   }
}

