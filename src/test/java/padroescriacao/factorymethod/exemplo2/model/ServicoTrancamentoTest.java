package padroescriacao.factorymethod.exemplo2.model;

import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.exemplo2.factory.ServicoFactory;

import static org.junit.jupiter.api.Assertions.*;

class ServicoTrancamentoTest {

    @Test
    void deveExecutarTrancamento() {
        IServico servico = ServicoFactory.obterServico("Trancamento");
        assertEquals("Trancamento efetivado", servico.executar());
    }

    @Test
    void deveCancelarTrancamento() {
        IServico servico = ServicoFactory.obterServico("Trancamento");
        assertEquals("Trancamento cancelado", servico.cancelar());
    }

}