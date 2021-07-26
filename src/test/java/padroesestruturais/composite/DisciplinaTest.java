package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {

    @Test
    void deveRetornarEmentaDisciplina() {
        Unidade unidade1 = new Unidade("Padrões de Criacao");

        Unidade unidade2 = new Unidade("Padrões Estruturais");
        Topico topico21 = new Topico("Padrão Composite", 2);
        unidade2.addConteudo(topico21);

        Unidade unidade3 = new Unidade("Padrões Comportamentais");
        Topico topico31 = new Topico("Padrão Observer", 3);
        Topico topico32 = new Topico("Padrão State", 4);
        unidade3.addConteudo(topico31);
        unidade3.addConteudo(topico32);

        Unidade ementa = new Unidade("Padrões de Projeto");
        ementa.addConteudo(unidade1);
        ementa.addConteudo(unidade2);
        ementa.addConteudo(unidade3);

        Disciplina disciplina = new Disciplina();
        disciplina.setEmenta(ementa);

        assertEquals("Unidade: Padrões de Projeto\n" +
                "Unidade: Padrões de Criacao\n" +
                "Unidade: Padrões Estruturais\n" +
                "Tópico: Padrão Composite - carga horária: 2\n" +
                "Unidade: Padrões Comportamentais\n" +
                "Tópico: Padrão Observer - carga horária: 3\n" +
                "Tópico: Padrão State - carga horária: 4\n", disciplina.getEmenta());
    }

    @Test
    void deveRetornarExecacaoDisciplinaSemEmenta() {
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