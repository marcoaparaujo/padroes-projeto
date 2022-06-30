package padroescomportamentais.state;

public class AlunoEstadoFormado extends AlunoEstado {

    private AlunoEstadoFormado() {};
    private static AlunoEstadoFormado instance = new AlunoEstadoFormado();
    public static AlunoEstadoFormado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Formado";
    }


}
