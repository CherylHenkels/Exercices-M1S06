import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosProfessores {

    public static List<Professor> listaProfessores = new ArrayList<>();

    //Construtor
    public DadosProfessores() {
    }

    //Getters and Setters
    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }


    //Metodos
    public static void adicionarProfessor(Scanner scanner) {
        Professor professor = new Professor();
        System.out.println("Digite as informações do professor: ");
        System.out.println("Nome:");
        professor.setNome(scanner.nextLine());
        System.out.println("Idade:");
        professor.setIdade(nextInt(scanner));
        System.out.println("Tempo de Trabalho:");
        professor.setTempoTrabalho(nextInt(scanner));
        System.out.println("Salário:");
        professor.setSalario(scanner.nextDouble());
        scanner.nextLine();

        listaProfessores.add(professor);
        System.out.println("Professor " + professor.getNome() + " adicionado!");
    }

    public void removerProfessor(Scanner scanner) {
        listarProfessores();
        Professor professor = buscarProfessor(scanner);
        listaProfessores.remove(professor);
        System.out.println("Professor " + professor.getNome() + " removido!");
    }

    public static Professor buscarProfessor(Scanner scanner) {
        System.out.println("Digite o id do professor:");
        int id = nextInt(scanner);
        Professor professorBuscado = null;
        for(int i = 0; i < listaProfessores.size(); i++) {
            int listItem = i + 1 ;
            if(listItem == id){
                professorBuscado =  listaProfessores.get(i);
                break;
            }
        }
        return professorBuscado;
    }

    public static void listarProfessores(){
        System.out.println("A lista de professores é:");
        int i = 1;
        for(Professor professor : listaProfessores){
            System.out.println(i + " - " + professor.getNome());
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
