package padroescomportamentais.memento;

import padroescomportamentais.state.Aluno;

public class AlunoEstadoEvadido implements AlunoEstado {

    private AlunoEstadoEvadido() {};
    private static AlunoEstadoEvadido instance = new AlunoEstadoEvadido();
    public static AlunoEstadoEvadido getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Evadido";
    }
    
}

