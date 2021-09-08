package padroescriacao.factorymethod;

public class ServicoMatricula implements IServico {

    public String executar() {
        return "Matrícula efetivada";
    }

    public String cancelar() {
        return "Matrícula cancelada";
    }
}
