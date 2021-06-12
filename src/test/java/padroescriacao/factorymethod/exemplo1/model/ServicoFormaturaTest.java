package padroescriacao.factorymethod.exemplo1.model;

import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.exemplo1.factory.ServicoFormaturaFactory;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFormaturaTest {

    @Test
    void deveExecutarFormatura() {
        IServico servico = new ServicoFormaturaFactory().obterServico();
        assertEquals("Formatura efetivada", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = new ServicoFormaturaFactory().obterServico();
        assertEquals("Formatura cancelada", servico.cancelar());
    }
}