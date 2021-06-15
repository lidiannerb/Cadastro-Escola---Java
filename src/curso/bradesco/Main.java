package curso.bradesco;

public class Main {

    public static void main(String[] args) {
	    Aluno aluno01 = new Aluno();
        aluno01.setMatricula(4681);
        aluno01.setSemestre(2);
        aluno01.setFaltas(5);


        System.out.println("A matrícula de Lidianne é " + aluno01.getMatricula());
        System.out.println("Próximo semestre de Lidianne é " + aluno01.getSemestre());
        System.out.println("A quantidade de faltas de Lidianne é " + aluno01.getFaltas());

    }
}
