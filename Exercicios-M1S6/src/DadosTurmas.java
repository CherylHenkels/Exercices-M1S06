import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosTurmas {
    public static List<Turma> listaTurmas = new ArrayList();

    public DadosTurmas() {

    }

    public static List<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(List<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }

    //Metodos
    public static void adicionarTurma(Scanner scanner) {
        Turma turma = new Turma();
        Curso curso = new Curso();
        System.out.println("Digite as informações do turma: ");
        System.out.println("Nome do curso:");
        curso = DadosCursos.buscaCurso(scanner.nextLine());
        turma.setCurso(curso);
        System.out.println("Ano de criação:");
        turma.setAnoCriacao(nextInt(scanner));

        listaTurmas.add(turma);
        System.out.println("Turma adicionada!");
    }

    public void removerTurma(Scanner scanner) {
        listarTurmas();
        Turma turma = buscarTurma(scanner);
        listaTurmas.remove(turma);
        System.out.println("Turma removida!");
    }

    public static Turma buscarTurma(Scanner scanner) {
        System.out.println("Digite o id da turma:");
        int id = nextInt(scanner);
        Turma turmaBuscado = null;
        for(int i = 0; i < listaTurmas.size(); i++) {
            int listItem = i + 1 ;
            if(listItem == id){
                turmaBuscado =  listaTurmas.get(i);
                break;
            }
        }
        return turmaBuscado;
    }


    public static void listarTurmas(){
        System.out.println("A lista de turmas é:");
        int i = 1;
        for(Turma turma : listaTurmas){
            System.out.println(i + " - " + turma.getCurso().getNomeCurso() + " - " + turma.getAnoCriacao());
            i++;
        }
    }

    public static List<Turma> buscarTurmasAluno(Aluno alunoEscolhido) {
        List<Turma> listaTurmasAluno = new ArrayList();
//        List<Aluno> listaAluno = new ArrayList();
        for(Turma turma : listaTurmas){
            for (Aluno aluno : turma.getListaAlunos()){
                if(alunoEscolhido.equals(aluno)){
                    listaTurmasAluno.add(turma);
                }
            }
             }
        return listaTurmasAluno;
    }

    public static void listarTurmasAluno(Aluno alunoEscolhido) {
        int i = 1;
        for(Turma turma : buscarTurmasAluno(alunoEscolhido)){
            System.out.println(i + " - " + turma.getCurso().getNomeCurso());
            i++;
        }
    }

    public static void deletarTurmaAluno(Scanner scanner, Aluno alunoEscolhido) {
        listarTurmasAluno(alunoEscolhido);
        System.out.println("Digite o id do curso:");
        int id = nextInt(scanner);
        List<Turma> listaTurmasAluno = buscarTurmasAluno(alunoEscolhido);
        for( int i = 0; i < listaTurmasAluno.size() ; i++){
            int listItem = i + 1 ;
            if(id == listItem){
                listaTurmasAluno.get(i).removerAluno(alunoEscolhido);
                System.out.println("Removido id" + listItem);
                break;
            }
        }
    }



    private static int nextInt(Scanner scn){
        int i = scn.nextInt();
        //consumindo "ENTER" para futuros "nextLine()"
        scn.nextLine();
        return i;
    }

}
