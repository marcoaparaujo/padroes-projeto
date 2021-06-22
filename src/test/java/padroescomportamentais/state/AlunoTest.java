package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals("Matrícula não realizada", aluno.matricular());
    }

    @Test
    public void deveFormarAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertEquals("Formatura realizada", aluno.formar());
    }

    @Test
    public void deveTrancarAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertEquals("Trancamento realizado", aluno.trancar());
    }

    @Test
    public void deveJubilarAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertEquals("Jubilamento realizado", aluno.jubilar());
    }

    @Test
    public void deveEvadirAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertEquals("Evasão realizada", aluno.evadir());
    }

    @Test
    public void deveTransferirAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertEquals("Transferência realizada", aluno.transferir());
    }

    // Aluno trancado

    @Test
    public void deveMatricularAlunoTrancado() {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        assertEquals("Matrícula realizada", aluno.matricular());
    }

    @Test
    public void naoDeveFormarAlunoTrancado() {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        assertEquals("Formatura não realizada", aluno.formar());
    }

    @Test
    public void naoDeveTrancarAlunoTrancado() {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        assertEquals("Trancamento não realizado", aluno.trancar());
    }

    @Test
    public void deveJubilarAlunoTrancado() {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        assertEquals("Jubilamento realizado", aluno.jubilar());
    }

    @Test
    public void deveEvadirAlunoTrancado() {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        assertEquals("Evasão realizada", aluno.evadir());
    }

    @Test
    public void naoDeveTransferirAlunoTrancado() {
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        assertEquals("Transferência não realizada", aluno.transferir());
    }

    // Aluno formado

    @Test
    public void naoDeveMatricularAlunoFormado() {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertEquals("Matrícula não realizada", aluno.matricular());
    }

    @Test
    public void naoDeveFormarAlunoFormado() {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertEquals("Formatura não realizada", aluno.formar());
    }

    @Test
    public void naoDeveTrancarAlunoFormado() {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertEquals("Trancamento não realizado", aluno.trancar());
    }

    @Test
    public void naoDeveJubilarAlunoFormado() {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertEquals("Jubilamento não realizado", aluno.jubilar());
    }

    @Test
    public void naoDeveEvadirAlunoFormado() {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertEquals("Evasão não realizada", aluno.evadir());
    }

    @Test
    public void naoDeveTransferirAlunoFormado() {
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertEquals("Transferência não realizada", aluno.transferir());
    }

    // Aluno jubilado

    @Test
    public void naoDeveMatricularAlunoJubilado() {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        assertEquals("Matrícula não realizada", aluno.matricular());
    }

    @Test
    public void naoDeveFormarAlunoJubilado() {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        assertEquals("Formatura não realizada", aluno.formar());
    }

    @Test
    public void naoDeveTrancarAlunoJubilado() {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        assertEquals("Trancamento não realizado", aluno.trancar());
    }

    @Test
    public void naoDeveJubilarAlunoJubilado() {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        assertEquals("Jubilamento não realizado", aluno.jubilar());
    }

    @Test
    public void naoDeveEvadirAlunoJubilado() {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        assertEquals("Evasão não realizada", aluno.evadir());
    }

    @Test
    public void naoDeveTransferirAlunoJubilado() {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        assertEquals("Transferência não realizada", aluno.transferir());
    }

    // Aluno evadido

    @Test
    public void naoDeveMatricularAlunoEvadido() {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        assertEquals("Matrícula não realizada", aluno.matricular());
    }

    @Test
    public void naoDeveFormarAlunoEvadido() {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        assertEquals("Formatura não realizada", aluno.formar());
    }

    @Test
    public void naoDeveTrancarAlunoEvadido() {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        assertEquals("Trancamento não realizado", aluno.trancar());
    }

    @Test
    public void deveJubilarAlunoEvadido() {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        assertEquals("Jubilamento realizado", aluno.jubilar());
    }

    @Test
    public void naoDeveEvadirAlunoEvadido() {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        assertEquals("Evasão não realizada", aluno.evadir());
    }

    @Test
    public void naoDeveTransferirAlunoEvadido() {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        assertEquals("Transferência não realizada", aluno.transferir());
    }

    // Aluno transferido

    @Test
    public void naoDeveMatricularAlunoTransferido() {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        assertEquals("Matrícula não realizada", aluno.matricular());
    }

    @Test
    public void naoDeveFormarAlunoTransferido() {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        assertEquals("Formatura não realizada", aluno.formar());
    }

    @Test
    public void naoDeveTrancarAlunoTransferido() {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        assertEquals("Trancamento não realizado", aluno.trancar());
    }

    @Test
    public void naoDeveJubilarAlunoTransferido() {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        assertEquals("Jubilamento não realizado", aluno.jubilar());
    }

    @Test
    public void naoDeveEvadirAlunoTransferido() {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        assertEquals("Evasão não realizada", aluno.evadir());
    }

    @Test
    public void naoDeveTransferirAlunoTransferido() {
        aluno.setEstado(AlunoEstadoTransferido.getInstance());
        assertEquals("Transferência não realizada", aluno.transferir());
    }


}