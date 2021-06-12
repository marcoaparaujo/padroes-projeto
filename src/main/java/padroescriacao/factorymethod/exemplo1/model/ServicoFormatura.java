package padroescriacao.factorymethod.exemplo1.model;

public class ServicoFormatura implements IServico {

    public String executar() {
        return "Formatura efetivada";
    }

    public String cancelar() {
        return "Formatura cancelada";
    }
}
