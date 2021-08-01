package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveElogiarSecretaria() {
        Aluno aluno = new Aluno();
        assertEquals("A Ouvidoria agradece seu contato.\nA Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Secretaria agradece a mensagem: Ótimo atendimento",
                aluno.elogiarSecretaria("Ótimo atendimento"));
    }

    @Test
    void deveReclamarSecretaria() {
        Aluno aluno = new Aluno();
        assertEquals("A Ouvidoria agradece seu contato.\nA Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Secretaria vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                aluno.reclamarSecretaria("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirSecretaria() {
        Aluno aluno = new Aluno();
        assertEquals("A Ouvidoria agradece seu contato.\nA Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Secretaria vai analisar a sugestão: Ampliar horário funcionamento",
                aluno.sugerirSecretaria("Ampliar horário funcionamento"));
    }

}