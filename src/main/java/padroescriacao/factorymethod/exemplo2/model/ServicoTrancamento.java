package padroescriacao.factorymethod.exemplo2.model;

public class ServicoTrancamento implements IServico {

    public String executar() {
        return "Trancamento efetivado";
    }

    public String cancelar() {
        return "Trancamento cancelado";
    }
}
