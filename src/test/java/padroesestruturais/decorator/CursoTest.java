package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarCargaHorariaCurso() {
        Curso curso = new CursoGraduacao(1000.0f);

        assertEquals(1000.0f, curso.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCursoComEstagio() {
        Curso curso = new Estagio(new CursoGraduacao(1000.0f));

        assertEquals(1100.0f, curso.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCursoComAtividadesComplementares() {
        Curso curso = new AtividadesComplementares(new CursoGraduacao(1000.0f));

        assertEquals(1200.0f, curso.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCursoComTrabalhoConclusaoCurso() {
        Curso curso = new TrabalhoConclusaoCurso(new CursoGraduacao(1000.0f));

        assertEquals(1050.0f, curso.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCursoComEstagioMaisAtividadesComplementares() {
        Curso curso = new Estagio(new AtividadesComplementares(new CursoGraduacao(1000.0f)));

        assertEquals(1320.0f, curso.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCursoComEstagioMaisTrabalhoConclusaoCurso() {
        Curso curso = new Estagio(new TrabalhoConclusaoCurso(new CursoGraduacao(1000.0f)));

        assertEquals(1155.0f, curso.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCursoComAtividadesComplementaresMaisTrabalhoConclusaoCurso() {
        Curso curso = new AtividadesComplementares(new TrabalhoConclusaoCurso(new CursoGraduacao(1000.0f)));

        assertEquals(1260.0f, curso.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCursoComEstagioMaisAtividadesComplementaresMaisTrabalhoConclusaoCurso() {
        Curso curso = new Estagio(new AtividadesComplementares(new TrabalhoConclusaoCurso(new CursoGraduacao(1000.0f))));

        assertEquals(1386.0f, curso.getCargaHoraria());
    }

    @Test
    void deveRetornarEstruturaCurso() {
        Curso curso = new CursoGraduacao();

        assertEquals("Graduação", curso.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCursoComEstagio() {
        Curso curso = new Estagio(new CursoGraduacao());

        assertEquals("Graduação/Estágio", curso.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCursoComAtividadesComplementares() {
        Curso curso = new AtividadesComplementares(new CursoGraduacao());

        assertEquals("Graduação/ACC", curso.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCursoComTrabalhoConclusaoCurso() {
        Curso curso = new TrabalhoConclusaoCurso(new CursoGraduacao());

        assertEquals("Graduação/TCC", curso.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCursoComEstagioMaisAtividadesComplementares() {
        Curso curso = new Estagio(new AtividadesComplementares (new CursoGraduacao()));

        assertEquals("Graduação/ACC/Estágio", curso.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCursoComEstagioMaisTrabalhoConclusaoCurso() {
        Curso curso = new Estagio(new TrabalhoConclusaoCurso (new CursoGraduacao()));

        assertEquals("Graduação/TCC/Estágio", curso.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCursoComAtividadesComplementaresMaisTrabalhoConclusaoCurso() {
        Curso curso = new AtividadesComplementares(new TrabalhoConclusaoCurso (new CursoGraduacao()));

        assertEquals("Graduação/TCC/ACC", curso.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCursoComEstagioMaisAtividadesComplementaresMaisTrabalhoConclusaoCurso() {
        Curso curso = new Estagio (new AtividadesComplementares(new TrabalhoConclusaoCurso (new CursoGraduacao())));

        assertEquals("Graduação/TCC/ACC/Estágio", curso.getEstrutura());
    }

}