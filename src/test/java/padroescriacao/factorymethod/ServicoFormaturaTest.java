package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFormaturaTest {

    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("Formatura");
        assertEquals("Formatura efetivada", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("Formatura");
        assertEquals("Formatura cancelada", servico.cancelar());
    }

}