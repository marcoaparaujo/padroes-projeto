package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {

    @Test
    void deveRetornarEmentaDisciplina() {
        Unidade unidade1 = new Unidade("Padroes de Criacao");

        Unidade unidade2 = new Unidade("Padroes Estruturais");
        Topico topico21 = new Topico("Padrao Composite", 2);
        unidade2.addConteudo(topico21);

        Unidade unidade3 = new Unidade("Padroes Comportamenentais");
        Topico topico31 = new Topico("Padrao Observer", 3);
        Topico topico32 = new Topico("Padrao State", 4);
        unidade3.addConteudo(topico31);
        unidade3.addConteudo(topico32);

        Disciplina disciplina = new Disciplina();
        Unidade ementa = new Unidade("Padroes de Projeto");
        ementa.addConteudo(unidade1);
        ementa.addConteudo(unidade2);
        ementa.addConteudo(unidade3);
        disciplina.setEmenta(ementa);

        assertEquals("Unidade: Padroes de Projeto\n" +
                "Unidade: Padroes de Criacao\n" +
                "Unidade: Padroes Estruturais\n" +
                "Tópico: Padrao Composite - carga horária: 2\n" +
                "Unidade: Padroes Comportamenentais\n" +
                "Tópico: Padrao Observer - carga horária: 3\n" +
                "Tópico: Padrao State - carga horária: 4\n", disciplina.getEmenta());
    }

    @Test
    void deveRetornarExecacaoParaEmentaSemDisciplina() {
        try {
            Disciplina disciplina = new Disciplina();
            disciplina.getEmenta();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Disciplina sem ementa", e.getMessage());
        }
    }
}