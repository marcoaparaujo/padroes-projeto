package padroescriacao.factorymethod.exemplo1.model;

import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.exemplo1.factory.ServicoTrancamentoFactory;

import static org.junit.jupiter.api.Assertions.*;

class ServicoTrancamentoTest {

    @Test
    void deveExecutarTrancamento() {
        IServico servico = new ServicoTrancamentoFactory().obterServico();
        assertEquals("Trancamento efetivado", servico.executar());
    }

    @Test
    void deveCancelarTrancamento() {
        IServico servico = new ServicoTrancamentoFactory().obterServico();
        assertEquals("Trancamento cancelado", servico.cancelar());
    }

}