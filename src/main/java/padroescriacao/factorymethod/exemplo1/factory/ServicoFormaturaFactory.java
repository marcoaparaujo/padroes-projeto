package padroescriacao.factorymethod.exemplo1.factory;

import padroescriacao.factorymethod.exemplo1.model.IServico;
import padroescriacao.factorymethod.exemplo1.model.ServicoFormatura;

public class ServicoFormaturaFactory implements IServicoFactory {

    public IServico obterServico() {
        return new ServicoFormatura();
    }
}
