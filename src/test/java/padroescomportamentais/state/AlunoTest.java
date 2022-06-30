package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    Aluno aluno;

    @BeforeEach
    public void setUp() {
        aluno = new Aluno();
    }

    // Aluno matriculado

    @Test
    public void naoDeveMatricularAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertFalse(aluno.matricular());
    }

    @Test
    public void deveFormarAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertTrue(aluno.formar());
        assertEquals(AlunoEstadoFormado.getInstance(), aluno.getEstado());
    }

    @Test
    public void deveTrancarAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertTrue(aluno.trancar());
        assertEquals(AlunoEstadoTrancado.getInstance(), aluno.getEstado());
    }

    @Test
    public void deveJubilarAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertTrue(aluno.jubilar());
        assertEquals(AlunoEstadoJubilado.getInstance(), aluno.getEstado());
    }

    @Test
    public void deveEvadirAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertTrue(aluno.evadir());
        assertEquals(AlunoEstadoEvadido.getInstance(), aluno.getEstado());
    }

    @Test
    public void deveTransferirAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertTrue(aluno.transferir());
        assertEquals(AlunoEstadoTransferido.getInstance(), aluno.getEstado());
    }

    // Aluno trancado

    @Test
    public void deveMatricularAlunoTrancado() {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        assertTrue(aluno.matricular());
        assertEquals(AlunoEstadoMatriculado.getInstance(), aluno.getEstado());
    }

    @Test
    public void naoDeveFormarAlunoTrancado() {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        assertFalse(aluno.formar());
    }

    @Test
    public void naoDeveTrancarAlunoTrancado() {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        assertFalse(aluno.trancar());
    }

    @Test
    public void deveJubilarAlunoTrancado() {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        assertTrue(aluno.jubilar());
        assertEquals(AlunoEstadoJubilado.getInstance(), aluno.getEstado());
    }

    @Test
    public void deveEvadirAlunoTrancado() {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        assertTrue(aluno.evadir());
        assertEquals(AlunoEstadoEvadido.getInstance(), aluno.getEstado());
    }

    @Test
    public void naoDeveTransferirAlunoTrancado() {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        assertFalse(aluno.transferir());
    }

    // Aluno formado

    @Test
    public void naoDeveMatricularAlunoFormado() {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertFalse(aluno.matricular());
    }

    @Test
    public void naoDeveFormarAlunoFormado() {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertFalse(aluno.formar());
    }

    @Test
    public void naoDeveTrancarAlunoFormado() {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertFalse(aluno.trancar());
    }

    @Test
    public void naoDeveJubilarAlunoFormado() {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertFalse(aluno.jubilar());
    }

    @Test
    public void naoDeveEvadirAlunoFormado() {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertFalse(aluno.evadir());
    }

    @Test
    public void naoDeveTransferirAlunoFormado() {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertFalse(aluno.transferir());
    }

    // Aluno jubilado

    @Test
    public void naoDeveMatricularAlunoJubilado() {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        assertFalse(aluno.matricular());
    }

    @Test
    public void naoDeveFormarAlunoJubilado() {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        assertFalse(aluno.formar());
    }

    @Test
    public void naoDeveTrancarAlunoJubilado() {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        assertFalse(aluno.trancar());
    }

    @Test
    public void naoDeveJubilarAlunoJubilado() {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        assertFalse(aluno.jubilar());
    }

    @Test
    public void naoDeveEvadirAlunoJubilado() {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        assertFalse(aluno.evadir());
    }

    @Test
    public void naoDeveTransferirAlunoJubilado() {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        assertFalse(aluno.transferir());
    }

    // Aluno evadido

    @Test
    public void naoDeveMatricularAlunoEvadido() {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        assertFalse(aluno.matricular());
    }

    @Test
    public void naoDeveFormarAlunoEvadido() {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        assertFalse(aluno.formar());
    }

    @Test
    public void naoDeveTrancarAlunoEvadido() {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        assertFalse(aluno.trancar());
    }

    @Test
    public void deveJubilarAlunoEvadido() {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        assertTrue(aluno.jubilar());
        assertEquals(AlunoEstadoJubilado.getInstance(), aluno.getEstado());
    }

    @Test
    public void naoDeveEvadirAlunoEvadido() {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        assertFalse(aluno.evadir());
    }

    @Test
    public void naoDeveTransferirAlunoEvadido() {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        assertFalse(aluno.transferir());
    }

    // Aluno transferido

    @Test
    public void naoDeveMatricularAlunoTransferido() {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        assertFalse(aluno.matricular());
    }

    @Test
    public void naoDeveFormarAlunoTransferido() {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        assertFalse(aluno.formar());
    }

    @Test
    public void naoDeveTrancarAlunoTransferido() {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        assertFalse(aluno.trancar());
    }

    @Test
    public void naoDeveJubilarAlunoTransferido() {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        assertFalse(aluno.jubilar());
    }

    @Test
    public void naoDeveEvadirAlunoTransferido() {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        assertFalse(aluno.evadir());
    }

    @Test
    public void naoDeveTransferirAlunoTransferido() {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        assertFalse(aluno.transferir());
    }


}