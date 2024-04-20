import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {

    private String nome;
    private int idade;
    private StatusMatricula statusMatricula;


    // Contrutor
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, StatusMatricula statusMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.statusMatricula = statusMatricula;
    }

    public Aluno() {
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public StatusMatricula getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(StatusMatricula statusMatricula) {
        this.statusMatricula = statusMatricula;
    }


    //Métodos

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + '}';
    }

//    public void listarCursosAluno() {
//        int counter = 1;
//        List<Curso> cursosAluno = buscarCursosAluno();
//        for (Curso curso : cursosAluno) {
//            System.out.println(counter + " - " + curso.getNomeCurso());
//            counter++;
//        }
//        if (counter == 1) {
//            System.out.println("Você não está matriculado em nenhum curso");
//        }
//    }


//    public List<Curso> buscarCursosAluno() {
//        List<Curso> cursosAluno = new ArrayList<>();
//        for (Turma turma : DadosTurmas.getListaTurmas()) {
//            for (Aluno aluno : turma.getListaAlunos()) {
//                if (aluno.getNome().equals(this.getNome())) {
//                    cursosAluno.add(turma.getCurso());
//                }
//            }
//        }
//        return cursosAluno;
//        }

    public void listarTurmasAluno() {
        int counter = 1;
        List<Turma> turmasAluno = buscarTurmasAluno();
        for (Turma turma : turmasAluno) {
            System.out.println(counter + " - " + turma.getCurso().getNomeCurso());
            counter++;
        }
        if (counter == 1) {
            System.out.println("Você não está matriculado em nenhum curso");
        }
    }

    public List<Turma> buscarTurmasAluno() {
        List<Turma> turmasAluno = new ArrayList<>();
        for (Turma turma : DadosTurmas.getListaTurmas()) {
            for (Aluno aluno : turma.getListaAlunos()) {
                if (aluno.getNome().equals(this.getNome())) {
                    turmasAluno.add(turma);
                }
            }
        }
        return turmasAluno;
    }

//    public void deletarTurmaAluno(Scanner scanner, Aluno alunoEscolhido){
//        int counter = 1;
//        listarTurmasAluno();
//        System.out.println("Digite o id do curso para deletar");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        for (Turma turma: buscarTurmasAluno()) {
//            if(id == counter){
//                turma.removerAluno(alunoEscolhido.getNome());
//                System.out.println("Aluno removido com sucesso " + counter);
//            }
//            counter++;
//        }
 //   }

    public void trancarMatricula () {
        if (statusMatricula.equals(statusMatricula.ATIVO)) {
            statusMatricula = statusMatricula.TRANCADO;
            System.out.println("O aluno está " + statusMatricula);
        } else if (statusMatricula.equals(statusMatricula.TRANCADO)) {
            System.out.println("O aluno já estava " + statusMatricula);
        } else {
            System.out.println("O aluno ja é formado!");
        }
    }


    public void ativarMatricula () {
        if (statusMatricula.equals(statusMatricula.TRANCADO)) {
            statusMatricula = statusMatricula.ATIVO;
            System.out.println("Aluno " + statusMatricula);
        } else if (statusMatricula.equals(statusMatricula.ATIVO)) {
            System.out.println("Aluno já está " + statusMatricula);
        } else {
            System.out.println("Aluno já é formado");
        }
    }
}
