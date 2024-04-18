import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Turma {

    //Atributos

     private List<Aluno> listaAlunos = new ArrayList<>();
     private int anoCriacao;
     private Curso curso;


     //Construtores
    public Turma(List<Aluno> listaAlunos, int anoCriacao, Curso curso) {
        this.listaAlunos = listaAlunos;
        this.anoCriacao = anoCriacao;
        this.curso = curso;
    }

    public Turma() {
    }

    //Getters and Setters

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    //Métodos
    public void listarAlunos(){
        int i = 1;
        for(Aluno aluno : listaAlunos){
            System.out.println(i + " - " + aluno.getNome() + " - " + aluno.getIdade() + " anos");
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

    // Métodos com sobrecarga
    //Mostra a lista de alunos com idade maior que uma idade mínima
    public void listarAlunos(int minIdade) {
        int i = 1;
        for (Aluno aluno : listaAlunos) {
            if (aluno.getIdade() >= minIdade) {
                System.out.println(i + " - " + aluno.getNome() + " - " + aluno.getIdade() + " anos");
                i++;
            }
        }
    }

    // Adiciona múltiplos alunos
    public void adicionarAluno(List<Aluno> novosAlunos) {
        listaAlunos.addAll(novosAlunos);
    }

    //Remove aluno por nome
    public void removerAluno(String nome) {
        listaAlunos.removeIf(aluno -> aluno.getNome().equals(nome));
    }

    @Override
    public String toString() {
        return "Turma{" + "listaAlunos=" + listaAlunos + '}';
    }
}
