package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecretariaTest {

    Secretaria secretaria;
    Semestre semestre;

    @BeforeEach
    void setUp() {
        secretaria = new Secretaria();
        semestre = new Semestre (2021, 1);
    }

    @Test
    void deveAbrirSemestre() {
        Tarefa aberturaSemestre = new AberturaSemestreTarefa(semestre);
        secretaria.executarTarefa(aberturaSemestre);

        assertEquals("Semestre aberto", semestre.getSituacao());
    }

    @Test
    void deveFecharSemestre() {
        Tarefa fechamentoSemestre = new FechamentoSemestreTarefa(semestre);
        secretaria.executarTarefa(fechamentoSemestre);

        assertEquals("Semestre fechado", semestre.getSituacao());
    }

    @Test
    void deveCancelarFechamentoSemestre() {
        Tarefa aberturaSemestre = new AberturaSemestreTarefa(semestre);
        Tarefa fechamentoSemestre = new FechamentoSemestreTarefa(semestre);

        secretaria.executarTarefa(aberturaSemestre);
        secretaria.executarTarefa(fechamentoSemestre);

        secretaria.cancelarUltimaTarefa();

        assertEquals("Semestre aberto", semestre.getSituacao());
    }

}