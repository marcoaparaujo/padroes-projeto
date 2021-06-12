package padroescriacao.factorymethod.exemplo1.model;

import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.exemplo1.factory.ServicoMatriculaFactory;

import static org.junit.jupiter.api.Assertions.*;

class ServicoMatriculaTest {

    @Test
    void deveExecutarMatricula() {
        IServico servico = new ServicoMatriculaFactory().obterServico();
        assertEquals("Matrícula efetivada", servico.executar());
    }

    @Test
    void deveCancelarMatricula() {
        IServico servico = new ServicoMatriculaFactory().obterServico();
        assertEquals("Matrícula cancelada", servico.cancelar());
    }
}