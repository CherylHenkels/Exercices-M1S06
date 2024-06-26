import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosAlunos {
    public static List<Aluno> listaAlunos = new ArrayList();

    public DadosAlunos() {

    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    //Metodos
    public static void adicionarAluno(Scanner scanner) {
        Aluno aluno = new Aluno();
        System.out.println("Digite as informações do aluno: ");
        System.out.println("Nome:");
        aluno.setNome(scanner.nextLine());
        System.out.println("Idade:");
        aluno.setIdade(nextInt(scanner));
        System.out.println("Escolha o status de matricula:");
        for (StatusMatricula statusMatricula: StatusMatricula.values()) {
            System.out.println(statusMatricula);
        }
        aluno.setStatusMatricula(StatusMatricula.valueOf(scanner.nextLine()));

        listaAlunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado!");
    }

    //Override de adicionar Aluno
    public static void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void removerAluno(Scanner scanner) {
        listarAlunos();
        Aluno aluno = buscarAluno(scanner);
        listaAlunos.remove(aluno);
        System.out.println("Aluno " + aluno.getNome() + " removido!");
    }

    public static Aluno buscarAluno(Scanner scanner) {
        System.out.println("Digite o id do aluno:");
        int id = nextInt(scanner);
        Aluno alunoBuscado = null;
        for(int i = 0; i < listaAlunos.size(); i++) {
            int listItem = i + 1 ;
            if(listItem == id){
                alunoBuscado =  listaAlunos.get(i);
                break;
            }
        }
        return alunoBuscado;
    }

    public static void listarAlunos(){
        System.out.println("A lista de alunos é:");
        int i = 1;
        for(Aluno aluno : listaAlunos){
            System.out.println(i + " - " + aluno.getNome());
            i++;
        }
    }

    private static int nextInt(Scanner scn){
        int i = scn.nextInt();
        //consumindo "ENTER" para futuros "nextLine()"
        scn.nextLine();
        return i;
    }

}
