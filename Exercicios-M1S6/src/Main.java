import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Testando os métodos
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

        System.out.println("\n\n ---------------------------------- \n");

        // Exercício 5 - Demonstrando o uso de values() e valueOf().
        System.out.println("Status de matrícula:");
        for (StatusMatricula statusMatricula: StatusMatricula.values()) {
            System.out.println(statusMatricula);
        }

        System.out.println("\nCargos de funcionários");
        for (CargoFuncionario cargoFuncionario: CargoFuncionario.values()) {
            System.out.println(cargoFuncionario);
        }

        System.out.println("\nA maioria dos alunos está: " + StatusMatricula.valueOf("ATIVO"));
        System.out.println("A maioria dos funcionarios é: " + CargoFuncionario.valueOf("INICIANTE"));


    }
}