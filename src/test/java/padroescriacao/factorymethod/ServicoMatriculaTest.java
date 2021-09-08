package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoMatriculaTest {

    @Test
    void deveExecutarMatricula() {
        IServico servico = ServicoFactory.obterServico("Matricula");
        assertEquals("Matrícula efetivada", servico.executar());
    }

    @Test
    void deveCancelarMatricula() {
        IServico servico = ServicoFactory.obterServico("Matricula");
        assertEquals("Matrícula cancelada", servico.cancelar());
    }

}