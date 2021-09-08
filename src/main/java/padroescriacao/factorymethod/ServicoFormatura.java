package padroescriacao.factorymethod;

public class ServicoFormatura implements IServico {

    public String executar() {
        return "Formatura efetivada";
    }

    public String cancelar() {
        return "Formatura cancelada";
    }
}
