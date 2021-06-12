package padroescriacao.factorymethod.exemplo1.factory;

import padroescriacao.factorymethod.exemplo1.model.IServico;
import padroescriacao.factorymethod.exemplo1.model.ServicoMatricula;

public class ServicoMatriculaFactory implements IServicoFactory {

    public IServico obterServico() {
        return new ServicoMatricula();
    }
}
