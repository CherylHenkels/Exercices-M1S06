import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();
        Aluno aluno1 = new Aluno("Aluno 1", 20);
        Aluno aluno2 = new Aluno("Aluno 2", 24);


        turma.adicionarAluno(aluno1);

        turma.adicionarAluno(aluno2);

        turma.removerAluno(scanner);

        List<Aluno> alunosTurma = turma.getListaAlunos();

        for (Aluno aluno : alunosTurma) {
            System.out.println(aluno.getNome());
        }

    }
}