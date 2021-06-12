package padroescriacao.factorymethod.exemplo2.model;

import org.junit.jupiter.api.Test;
import padroescriacao.builder.exemplo2.Aluno;
import padroescriacao.builder.exemplo2.AlunoBuilder;
import padroescriacao.factorymethod.exemplo2.factory.ServicoFactory;

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