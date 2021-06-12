package padroescriacao.factorymethod.exemplo2.model;

public class ServicoMatricula implements IServico {

    public String executar() {
        return "Matrícula efetivada";
    }

    public String cancelar() {
        return "Matrícula cancelada";
    }
}
