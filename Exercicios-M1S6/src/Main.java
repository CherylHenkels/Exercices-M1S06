import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Aluno 1";
        aluno1.idade = 20;

        turma.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Aluno 2";
        aluno2.idade = 24;

        turma.adicionarAluno(aluno2);

        turma.removerAluno(scanner);

        turma.listarAlunos();

    }
}