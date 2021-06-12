package padroescriacao.factorymethod.exemplo1.factory;

import padroescriacao.factorymethod.exemplo1.model.IServico;
import padroescriacao.factorymethod.exemplo1.model.ServicoTrancamento;

public class ServicoTrancamentoFactory implements IServicoFactory {

    public IServico obterServico() {
        return new ServicoTrancamento();
    }
}
