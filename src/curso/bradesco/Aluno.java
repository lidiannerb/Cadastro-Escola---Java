package curso.bradesco;

public class Aluno {
    private String nome;
    private int matricula;
    private int semestre;
    private int faltas;


    public void setMatricula(int numeroMatricula){

        this.matricula = numeroMatricula;
    }
    public int getMatricula(){

        return this.matricula;
    }

    public void setSemestre(int numeroSemestre){

        this.semestre = numeroSemestre +1;
    }
    public int getSemestre(){

        return this.semestre;
    }

    public void setFaltas(int numeroFaltas){

        this.faltas = numeroFaltas;
    }
    public int getFaltas(){

        return this.faltas;
    }

}