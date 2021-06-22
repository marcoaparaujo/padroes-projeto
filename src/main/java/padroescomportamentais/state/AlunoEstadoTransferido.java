package padroescomportamentais.state;

public class AlunoEstadoTransferido implements AlunoEstado {

    private AlunoEstadoTransferido() {};
    private static AlunoEstadoTransferido instance = new AlunoEstadoTransferido();
    public static AlunoEstadoTransferido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Transferido";
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
