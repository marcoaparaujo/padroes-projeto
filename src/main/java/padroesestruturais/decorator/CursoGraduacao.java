package padroesestruturais.decorator;

public class CursoGraduacao implements Curso {

    public float cargaHoraria;

    public CursoGraduacao() {
    }

    public CursoGraduacao(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public String getEstrutura() {
        return "Graduação";
    }

}
