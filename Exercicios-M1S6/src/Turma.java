import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Turma {

    //Atributos

     List<Aluno> listaAlunos = new ArrayList<>();
     int anoCriacao;
     Curso curso;


     //Métodos
    public void listarAlunos(){
        int i = 1;
        for(Aluno aluno : listaAlunos){
            System.out.println(i + " - " + aluno.nome + " - " + aluno.idade + " anos");
            i++;
        }
    }

    public void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public void removerAluno(Scanner scanner){
        System.out.println("Para remover um aluno");
        listarAlunos();
        System.out.println("Digite o número da chamada:");


        int idAluno = scanner.nextInt();
        Aluno alunoEscolhido = null;

        for(int i = 0; i<listaAlunos.size(); i++){
            if(i+1==idAluno){
                alunoEscolhido = listaAlunos.get(i);
            }
        }
        listaAlunos.remove(alunoEscolhido);
    }
}
